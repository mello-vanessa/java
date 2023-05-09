package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

public class TaskController {
    
    public void save(Task tarefa){
        //concatenar para legibilidade gera custos na memória
        String strSql = "INSERT INTO tasks (idProject, name, description, completed, notes, deadline, createdAt, updatedAt) values (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conexao = null;
        PreparedStatement declaracao = null;
        
        try{
            //Estabelecer conexão com BD
            conexao = ConnectionFactory.getConnection();
            //Prepara a Query
            declaracao = conexao.prepareStatement(strSql);
            //Seta os valores na query preparada
            declaracao.setInt(1, tarefa.getIdProject());
            declaracao.setString(2, tarefa.getName());
            declaracao.setString(3, tarefa.getDescription());
            declaracao.setBoolean(4, tarefa.isCompleted());
            declaracao.setString(5, tarefa.getNotes());
            //java.util.Date e java.sql.date(na inserção do banco de dados)
            //classe de mesmo nome e pacotes diferentes
            //getTime: var num formato long que o setDate espera
            declaracao.setDate(6, new java.sql.Date(tarefa.getDeadline().getTime()));
            declaracao.setDate(7, new java.sql.Date(tarefa.getCreatedAt().getTime()));
            declaracao.setDate(8, new java.sql.Date(tarefa.getUpdatedAt().getTime()));
            //Executar a query
            declaracao.execute();
            
        }catch(SQLException e){
            throw new RuntimeException("Erro ao salvar a tarefa "+ e.getMessage(), e);
        }
        finally{
            ConnectionFactory.closeConnection(conexao,declaracao);
        }
    }
    
    public void update(Task tarefa) throws SQLException{
        String strSql = "UPDATE tasks SET idProject = ? name = ? description = ? completed = ? notes = ? deadline = ? createdAt = ? updatedAt = ? WHERE id = ?";
        
        Connection conexao = null;
        PreparedStatement declaracao = null;
        
        try{
            conexao = ConnectionFactory.getConnection();
            declaracao = conexao.prepareStatement(strSql);
            declaracao.setInt(1, tarefa.getIdProject());
            declaracao.setString(2, tarefa.getName());
            declaracao.setString(3, tarefa.getDescription());
            declaracao.setBoolean(4, tarefa.isCompleted());
            declaracao.setString(5, tarefa.getNotes());
            declaracao.setDate(6, new java.sql.Date(tarefa.getDeadline().getTime()));
            declaracao.setDate(7, new java.sql.Date(tarefa.getCreatedAt().getTime()));
            declaracao.setDate(8, new java.sql.Date(tarefa.getUpdatedAt().getTime()));
            declaracao.setInt(9, tarefa.getId());
            declaracao.execute();
        } catch(SQLException e){
            throw new SQLException("Erro ao alterar a tarefa "+ e.getMessage(), e); 
        }
        finally{
            ConnectionFactory.closeConnection(conexao, declaracao);
        }   
             
    }
    
    public void removeById(int taskId) throws SQLException{
        String strSql = "DELETE FROM tasks WHERE id = ?";
        Connection conexao = null;
        //preparar o sql, para evitar sql injection
        PreparedStatement declaracao = null;
        
        try{
            //pede conexao
            conexao = ConnectionFactory.getConnection();
            //prepara o sql
            declaracao = conexao.prepareStatement(strSql);
            //quero mudar a primeira interrogação, no delete from... na parte do id.
            // se o parametro taskid = 34
            //vai ficar DELETE FROM tasks WHERE id = 34
            declaracao.setInt(1, taskId);
            //executa o sql
            declaracao.execute();
        }catch(Exception e){
            throw new RuntimeException("Erro ao deletar a tarefa "+e.getMessage(), e);        
        }
        //sempre é executado, seja caindo no try, seja no catch
        finally{
            ConnectionFactory.closeConnection(conexao,declaracao);
        }        
    }
    
    //pegar todas as tarefas do projeto 002 por ex
    //idProject é chave estrangeira
    // o retorno do método é uma lista de tarefas
    public List<Task> getAll(int idProject) throws SQLException{
        String sql = "SELECT * FROM tasks WHERE id = ?";
        Connection conexao = null;
        PreparedStatement declaracao = null;
        //Quando fazemos uma pesquisa no banco, ele dá uma resposta.
        //Entao precisamos ter uma classe que represente este retorno.
        ResultSet retornoBanco = null;        
        //O método retorna uma estrutura de dados do tipo Lista da classe Task
        //Lista de tarefas que será devolvida quando a chamada do método acontecer
        List<Task> listaDeTarefas = new ArrayList<>();
        
        try{
            conexao = ConnectionFactory.getConnection();
            declaracao = conexao.prepareStatement(sql);
            //Setando o valor do filtro de busca
            declaracao.setInt(1, idProject);
            //executa a query e retorna um obj resultset
            // entao dentro do retonroBanco, tem os dados que correspondem a uma tarefa, 
            // que eu puxei no banco
            //valor retornado na execução da query
            retornoBanco = declaracao.executeQuery();
            //Enquanto houver valores a serem percorridos
            while(retornoBanco.next()){
                // cria uma nova task
                Task tarefa = new Task();
                //povoar o que tem no banco de dados na tarefa
                //eu uso o método para setar o id setando com o retorno do banco
                //usando o método getInt com o nome da coluna do banco id
                tarefa.setId(retornoBanco.getInt("id"));
                tarefa.setIdProject(retornoBanco.getInt("idProject"));
                tarefa.setName(retornoBanco.getString("name"));
                tarefa.setDescription(retornoBanco.getString("description"));
                tarefa.setIsCompleted(retornoBanco.getBoolean("completed"));
                tarefa.setNotes(retornoBanco.getString("notes"));
                tarefa.setDeadline(retornoBanco.getDate("deadline"));
                tarefa.setCreatedAt(retornoBanco.getDate("createdAt"));
                tarefa.setUpdatedAt(retornoBanco.getDate("updatedAt"));                
                //Agora colocar esta tarefa dentro da minha lista de tarefas
                listaDeTarefas.add(tarefa);
            }
            
        } catch(SQLException e){
            throw new SQLException("Erro ao buscar a tarefa."+e.getMessage(), e);
        }
        finally{
            ConnectionFactory.closeConnection(conexao, declaracao, retornoBanco);
        }                
        return listaDeTarefas;
    }
}

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
        String sql = " INSERT INTO tasks (idProject,"
                + "name,"
                + "description,"
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) values (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conexao = null;
        PreparedStatement declaracao = null;
        
        try{
            conexao = ConnectionFactory.getConnection();
            declaracao = conexao.prepareStatement(sql);
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
            declaracao.execute();
            
        }catch(SQLException e){
            throw new RuntimeException("Erro ao salvar a tarefa "+ e.getMessage(), e);
        }
        finally{
            ConnectionFactory.closeConnection(conexao,declaracao);
        }
    }
    
    public void update(Task tarefa) throws SQLException{
        String sql = "UPDATE tasks SET idProject = ?"
                + " name = ?"
                + " description = ?"
                + " completed = ?"
                + " notes = ?"
                + " deadline = ?"
                + " createdAt = ?"
                + " updatedAt = ?"
                + "WHERE id = ?";
        
        Connection conexao = null;
        PreparedStatement declaracao = null;
        
        try{
            conexao = ConnectionFactory.getConnection();
            declaracao = conexao.prepareStatement(sql);
            declaracao.setString(1, tarefa.getName());
            declaracao.setString(2, tarefa.getDescription());
            declaracao.setBoolean(3, tarefa.isCompleted());
            declaracao.setString(4, tarefa.getNotes());
            declaracao.setDate(5, new java.sql.Date(tarefa.getDeadline().getTime()));
            declaracao.setDate(6, new java.sql.Date(tarefa.getCreatedAt().getTime()));
            declaracao.setDate(7, new java.sql.Date(tarefa.getUpdatedAt().getTime()));
            declaracao.setInt(8, tarefa.getId());
            declaracao.execute();
        } catch(SQLException e){
            throw new SQLException("Erro ao alterar a tarefa "+ e.getMessage(), e); 
        }
        finally{
            ConnectionFactory.closeConnection(conexao, declaracao);
        }   
             
    }
    
    public void removeById(int taskId) throws SQLException{
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection conexao = null;
        //preparar o sql, para evitar sql injection
        PreparedStatement declaracao = null;
        
        try{
            //pede conexao
            conexao = ConnectionFactory.getConnection();
            //prepara o sql
            declaracao = conexao.prepareStatement(sql);
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
        List<Task> tarefaRetornada = new ArrayList<>();
        
        try{
            conexao = ConnectionFactory.getConnection();
            declaracao = conexao.prepareStatement(sql);
            declaracao.setInt(1, idProject);
            //executa a query e retorna um obj resultset
            retornoBanco = declaracao.executeQuery();
            //Enquanto tiver retornando coisos no banco
            while(retornoBanco.next()){
            }
            
        } catch(SQLException e){
            throw new SQLException("Erro ao buscar a tarefa."+e.getMessage(), e);
        }
        finally{
        }
                
        return null;
    }
}

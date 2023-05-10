package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

public class ProjectController {
//save,update.removebyid, getall(retorna uma lista)

    public void save(Project projeto) throws Exception{
        String strSql = "INSERT INTO `projects` (`name`, `description`, `createdAt`, `updatedAt`) VALUES (?, ?, ?, ?)";
        Connection conexao = null;
        PreparedStatement declaracao = null;
        
        try{
            conexao = ConnectionFactory.getConnection();
            declaracao = conexao.prepareStatement(strSql);
            declaracao.setString(1, projeto.getNome());
            declaracao.setString(2, projeto.getDescription());
            declaracao.setDate(3, new java.sql.Date(projeto.getCreatedAt().getTime()));
            declaracao.setDate(4, new java.sql.Date(projeto.getUpdatedAt().getTime()));
            declaracao.execute();
        } catch(SQLException ex){
            throw new Exception("Erro ao salvar o projeto.");
        }
        finally{
            ConnectionFactory.closeConnection(conexao, declaracao);
        }
    }
    
    public void update(Project projeto) throws Exception{
        String strSql = "UPDATE `projects` SET `name` = '?', `description` = '?', `createdAt` = '?', `updatedAt` = '?' WHERE `projects`.`id` = ?;";
        Connection conexao = null;
        PreparedStatement declaracao = null;
        
        try{
            conexao = ConnectionFactory.getConnection();
            declaracao = conexao.prepareStatement(strSql);
            declaracao.setString(1, projeto.getNome());
            declaracao.setString(2, projeto.getDescription());
            declaracao.setDate(3, new java.sql.Date(projeto.getCreatedAt().getTime()));
            declaracao.setDate(4, new java.sql.Date(projeto.getUpdatedAt().getTime()));
        } catch(SQLException ex){
            throw new Exception("Erro ao alterar o projeto.");
        }
        finally{
            ConnectionFactory.closeConnection(conexao, declaracao);
            
        }
    }
    public void removeById(int id) throws Exception{
        String strSql = "DELETE FROM projects WHERE `id` = ?";
        Connection conexao = null;
        PreparedStatement declaracao = null;
        
        try{
            conexao = ConnectionFactory.getConnection();
            declaracao = conexao.prepareStatement(strSql);
            declaracao.setInt(1, id);
        } catch(SQLException ex){
            throw new Exception("Erro ao remover o projeto.");
        }
        finally{
            ConnectionFactory.closeConnection(conexao, declaracao);
        }
    }
    
    public List<Project> getAll(int id) throws Exception{
        String strSql = "SELECT * FROM projects WHERE id = ?";
        Connection conexao = null;
        PreparedStatement declaracao = null;
        ResultSet retornoDoBanco = null;
        List<Project> listaDeProjetos = new ArrayList<>();
        
        try{
           conexao = ConnectionFactory.getConnection();
           declaracao = conexao.prepareStatement(strSql);
           declaracao.setInt(1, id);
           retornoDoBanco = declaracao.executeQuery();
           
           while(retornoDoBanco.next()){
               Project projeto = new Project();
               projeto.setId(retornoDoBanco.getInt("id"));
               projeto.setNome(retornoDoBanco.getString("name"));
               projeto.setDescription(retornoDoBanco.getString("description"));
               projeto.setCreatedAt(retornoDoBanco.getDate("createdAt"));
               projeto.setUpdatedAt(retornoDoBanco.getDate("updatedAt"));
               listaDeProjetos.add(projeto);
           }
        } catch(SQLException ex){
            throw new Exception("Erro ao buscar a lista de projetos.");
        }
        finally{
            ConnectionFactory.closeConnection(conexao, declaracao, retornoDoBanco);
        }
        
        return listaDeProjetos;
    }
}

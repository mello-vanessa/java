package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}

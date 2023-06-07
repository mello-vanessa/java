package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    //public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    // static para n ter de criar o obj
    public static Connection getConnection() throws SQLException{
        try{
            /*
            O processo de inicialização do driver, usando o Class.forName não é 
            mais necessário nas versões mais recentes do Java. Entretanto, ao 
            fazê-lo assim mesmo, você denuncia logo de cara a presença de 
            eventuais erros de classpath. Além disso, ele só precisa ser feito 
            uma vez, durante o carregamento do programa, e se falhar, o programa 
            está irremediavelmente quebrado. Assim sendo, esse processo pode ser 
            mantido em um bloco de inicialização estático.
            */
            //Basicamente:carrega o drive pra aplicação
            //Class.forName(DRIVER);
            //DriveManager - class do conj de dependencias do maven
            //com metodo get connection
            return DriverManager.getConnection(URL, USER, PASS);
        }//catch(ClassNotFoundException e){
        catch(Exception e){
            throw new RuntimeException("Erro na conexão ao banco de dados.", e);
        }
    }
    
    public static void closeConnection(Connection conexao){
        try{
            if(conexao != null){
                conexao.close();
            }
        }catch(SQLException ex){
            throw new RuntimeException("Erro no fechamento.");
        }
    }
    //Alem da conexao, tem que fechar o statement (declaração)
    public static void closeConnection(Connection conexao, PreparedStatement declaracao){
        try{
            if(conexao != null){
                conexao.close();
            }
            if(declaracao != null){
                declaracao.close();
            }
        }catch(SQLException ex){
            throw new RuntimeException("Erro no fechamento.");
        }
    }
    public static void closeConnection(Connection conexao, PreparedStatement declaracao, ResultSet resultadoBanco){
        try{
            if(conexao != null){
                conexao.close();
            }
            if(declaracao != null){
                declaracao.close();
            }
            if(resultadoBanco != null){
                resultadoBanco.close();
            }
        } catch(SQLException ex){
            throw new RuntimeException("Erro no fechamento.");
        }
    }
}

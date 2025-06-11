
package Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    Connection con;
    public Connection getConexao(){
        return con;
    }
    
    public void conectar(){
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/barbeariacx", "root", "root");
            System.out.println("Conectado ao banco de dados");
        }
        catch(SQLException e){
            System.out.println("Erro ao conectar " + e);
        }
    }
    
    public void desconectar() throws SQLException{
        if(con != null && !con.isClosed()){
            con.close();
            System.out.println("Desconectado do banco de dados");
        }
    }
}

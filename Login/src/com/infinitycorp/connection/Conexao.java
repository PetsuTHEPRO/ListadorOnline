package com.infinitycorp.connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection conector(){
        
        String url = "jdbc:mysql://localhost:3306/dblistagemonline";
        String usuario = "root";
        String senha = "";
        Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        
        try {
            Class.forName(driver);
            conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
            System.out.println("Construido Com Sucesso");
            return conexao;
        } catch (ClassNotFoundException ex) {
            System.out.println("ERRO ao TENTAR Conectar");
        } catch (SQLException ex){
            System.out.println("ERRO ao TENTAR Conectar | SQL");
        }
        return null;
    }
    
}

package com.infinitycorp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
        
    public static Connection conector(){
        
        String url = "jdbc:mysql://localhost:3306/dblistagemonline";
        String usuario = "root";
        String senha = "";
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        
        try {
            Class.forName(driver);
            conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
            System.out.println("Construido com Sucesso");
            return conexao;
        } catch (ClassNotFoundException ex) {
            System.out.println("ERRO ao TENTAR Conectar");
        } catch (SQLException ex){
            System.out.println("ERRO ao TENTAR Conectar | SQL");
        }
        
        return null;
    }
    
    public static void desconector(Connection conexao){   
        
        if (conexao != null) {
            try {
                System.out.println("Desconectado com Sucesso");
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }
    
}

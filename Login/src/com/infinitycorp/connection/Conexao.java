package com.infinitycorp.connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    
    public static Connection conector()throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/dblistagemonline";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return (Connection) DriverManager.getConnection(url, user, password);
        }catch (ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
        // handle any errors
        
        
    }
    
    
}

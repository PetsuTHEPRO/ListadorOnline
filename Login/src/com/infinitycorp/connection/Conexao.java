package com.infinitycorp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    
    
    public static Connection conector(){
        
        String url = "jdbc:mysql://localhost/dblistagemonline?";
        String user = "root";
        String password = "";
        try {
            return DriverManager.getConnection(url + "user="+ user +"&password="+ password);
        } catch (SQLException ex) {
            // handle any errors
            JOptionPane.showMessageDialog(null, ex, "Error SQL", 0);
            return null;
        }
        
    }
    
    
}

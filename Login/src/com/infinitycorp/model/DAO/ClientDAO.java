
package com.infinitycorp.model.DAO;

import com.infinitycorp.connection.Conexao;
import com.infinitycorp.model.identity.Client;
import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDAO {
    
    private final Connection connection;
  
    public ClientDAO(Conexao connection) {
        this.connection = connection.conector();
    }
    
    public boolean selectClient(Client client) throws SQLException{ 
            
            String sql = "select * from tbusuario where nome= ? and senha= ?";
            
            PreparedStatement pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, client.getUser());
            pStatement.setString(2, client.getPassword());
            pStatement.execute();
            
            ResultSet rSet = pStatement.getResultSet();
            
            return rSet.next();
            
    }
    
    public void insertClient(Client client) throws SQLException{
        
        String sql = "inset into client(name, user, password, birthDate) values (?,?,?,?)";
        
        PreparedStatement pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, client.getName());
        pStatement.setString(2, client.getUser());
        pStatement.setString(3, client.getPassword());
        pStatement.setDate(4, (Date) client.getBirthDate());
        pStatement.execute();
        
    }
    
    public void updateClient(Client client) throws SQLException{
        
        String sql = "update client set name = ?, user = ?, password = ?, birthDate = ? where id = ?";
        
        PreparedStatement pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, client.getName());
        pStatement.setString(2, client.getUser());
        pStatement.setString(3, client.getPassword());
        pStatement.setDate(4, (Date) client.getBirthDate());
        //pStatement.setInt(5, client.id);
        pStatement.execute();
        
    }
    
    public void deleteClient(Client client) throws SQLException{
        
        String sql = "delete from client where id = ?";
        
        PreparedStatement pStatement = connection.prepareStatement(sql);
        //pStatement.setInt(5, client.id);
        pStatement.execute();
        
    }
    
}

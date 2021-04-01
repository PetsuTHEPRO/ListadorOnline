/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.model.DAO;

import com.infinitycorp.connection.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author perge
 */
public class GenericDAO {
    
    private final Connection connection;
  
    public GenericDAO(Conexao connection) {
        this.connection = connection.conector();
    }
    
    public boolean selectGeneric(String select, Object... paramentos) throws SQLException{
        
        PreparedStatement pStatement = connection.prepareStatement(select);
        
        for(int i = 0; i < paramentos.length; i++){
            pStatement.setObject(i+1, paramentos[i]);
        }
        
        pStatement.execute();

        ResultSet rSet = pStatement.getResultSet();

        return rSet.next();

    }
    
    public boolean insertGeneric(String insert, Object... paramentos) throws SQLException{

        PreparedStatement pStatement = connection.prepareStatement(insert);
        
        for(int i = 0; i < paramentos.length; i++){
            pStatement.setObject(i+1, paramentos[i]);
        }
        
        pStatement.execute();
        
        ResultSet rSet = pStatement.getResultSet();
        
        return rSet.next();
        
    }
    
    public boolean updateGeneric(String update, Object... paramentos) throws SQLException{
    
        PreparedStatement pStatement = connection.prepareStatement(update);
        
        for(int i = 0; i < paramentos.length; i ++){
            pStatement.setObject(i+1, paramentos[i]);
        }
        
        pStatement.execute();
        
        ResultSet rSet = pStatement.getResultSet();
        
        return rSet.next();
        
    }
    
    public boolean deleteGeneric(String delete, Object... paramentos) throws SQLException{
        
        PreparedStatement pStatement = connection.prepareStatement(delete);
        
        for(int i = 0; i < paramentos.length; i++){
            pStatement.setObject(i+1, paramentos[i]);
        }
        
        pStatement.execute();
        
        ResultSet rSet = pStatement.getResultSet();
        
        return rSet.next();
        
    }
    
}

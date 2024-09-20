/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.model.DAO;

import com.infinitycorp.connection.Conexao;
import com.infinitycorp.model.identity.Client;
import com.infinitycorp.model.identity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author perge
 */
public class GenericDAO {
    
    private final Connection connection;
  
    public GenericDAO() {
        this.connection = Conexao.conector();
    }
    
    public Client selectGeneric(String select, Object... paramentos) {
        
        try{
            PreparedStatement pStatement = connection.prepareStatement(select);

            for(int i = 0; i < paramentos.length; i++){
                pStatement.setObject(i+1, paramentos[i]);
            }

            pStatement.execute();

            ResultSet rSet = pStatement.getResultSet();

            if(rSet.next()){

                Client client = new Client();

                client.setId(rSet.getInt("id"));
                client.setName(rSet.getString("name"));
                client.setLastName(rSet.getString("lastName"));
                client.setUser(rSet.getString("user"));
                client.setEmail(rSet.getString("email"));
                client.setPassword(rSet.getString("password"));
                client.setBirthDate(rSet.getDate("birthDate"));

                return client;
            }
        }catch(SQLException e){
            System.out.println("Error " + e);
        }
        
        return null;
    }
    
    public User selectGenericUser(String select, Object... paramentos) {
        
        try{
            PreparedStatement pStatement = connection.prepareStatement(select);

            for(int i = 0; i < paramentos.length; i++){
                pStatement.setObject(i+1, paramentos[i]);
            }

            pStatement.execute();

            ResultSet rSet = pStatement.getResultSet();

            if(rSet.next()){

                User user = new User();

                user.setId(rSet.getInt("id"));
                user.setName(rSet.getString("name"));
                user.setDescription(rSet.getString("description"));
                user.setVisibility(rSet.getBoolean("visibility"));
                user.setHasProfilePhoto(rSet.getBoolean("has_profile_photo"));
                user.setAvatar(rSet.getInt("avatar"));
                
                return user;
            }
        }catch(SQLException e){
            System.out.println("Error " + e);
        }
        
        return null;
    }    
    
    public boolean insertGeneric(String insert, Object... paramentos){

        try{
            
            PreparedStatement pStatement = connection.prepareStatement(insert);

            for(int i = 0; i < paramentos.length; i++){
                pStatement.setObject(i+1, paramentos[i]);
            }
            
            return ( (pStatement.executeUpdate()) > 0);
            
        }catch(SQLException e){
            System.out.println("Erro " + e);
        }
        
        return false;
    }
    
    public boolean updateGeneric(String update, Object... parametros) {
    
        try {
        
            PreparedStatement pStatement = connection.prepareStatement(update);
        
            for (int i = 0; i < parametros.length; i++) {
                pStatement.setObject(i + 1, parametros[i]);
            }

            int rowsAffected = pStatement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao executar atualização: " + e.getMessage());
        }

        return false;
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

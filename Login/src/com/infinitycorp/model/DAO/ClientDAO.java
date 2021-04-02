
package com.infinitycorp.model.DAO;

import com.infinitycorp.model.identity.Client;

import java.sql.SQLException;

public class ClientDAO extends GenericDAO{

    public void selectClient(Client client) throws SQLException{ 
            
        String sql = "select * from tbusuario where nome= ? and senha= ?";

        selectGeneric(sql, client.getName(), client.getPassword());            
    }
    
    public void insertClient(Client client) throws SQLException{
        
        String sql = "inset into client(name, user, password, birthDate) values (?,?,?,?)";
        
        insertGeneric(sql, client.getName(), client.getUser(), client.getPassword(), client.getBirthDate());
        
    }
    
    public void updateClient(Client client) throws SQLException{
        
        String sql = "update client set name = ?, user = ?, password = ?, birthDate = ? where id = ?";
        
        // Incompleto, faltou adicionar a lógica de pegar o ID.
        
        updateGeneric(sql, client.getName(), client.getUser(), client.getBirthDate());
        
    }
    
    public void deleteClient(Client client) throws SQLException{
        
        String sql = "delete from client where id = ?";
        
        // Incompleto, faltou adicionar a lógica de pegar o ID.
        
        deleteGeneric(sql);
        
    }
    
}

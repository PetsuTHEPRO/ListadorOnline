package com.infinitycorp.model.DAO;

import com.infinitycorp.model.identity.Client;


public class ClientDAO extends GenericDAO{

    public Client selectforUserAndSenha(Client client){ 
            
        String sql = "SELECT * FROM `client` WHERE `user` LIKE ? AND `password` LIKE ?";
        
        return selectGeneric(sql, client.getUser(), client.getPassword());            

    }
    
    public Client selectForUser(Client client){
        String sql = "SELECT * FROM `client` WHERE `user` LIKE ?";
        
        return selectGeneric(sql, client.getUser());
    }
    
    public Client selectforID(int id){
        
        String sql = "SELECT * FROM `client` where id = ?";
        
        return selectGeneric(sql, id);
    
    }
    
    public boolean insertClient(Client client){
        
        String sql = "insert into client (id, name, user, password, birthDate) VALUES (NULL,?,?,?,?)";
        
        return insertGeneric(sql, client.getName(), client.getUser(), client.getPassword(), client.getBirthDate());
        
    }
    
  //  public void updateClient(Client client) throws SQLException{
        
   //     String sql = "update client set name = ?, user = ?, password = ?, birthDate = ? where id = ?";
        
        // Incompleto, faltou adicionar a lógica de pegar o ID.
        
    //    updateGeneric(sql, client.getName(), client.getUser(), client.getBirthDate());
        
   // }
    
   // public void deleteClient(Client client) throws SQLException{
        
    //    String sql = "delete from client where id = ?";
        
        // Incompleto, faltou adicionar a lógica de pegar o ID.
        
  //      deleteGeneric(sql);
        
   // }
    
}

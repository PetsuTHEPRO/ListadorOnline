
package com.infinitycorp.model.service;

import com.infinitycorp.model.DAO.ClientDAO;
import com.infinitycorp.model.identity.Client;

public class ClientService {
    
    private final ClientDAO clientDAO;
    
    public ClientService() {
          this.clientDAO = new ClientDAO();
    }
    
    public boolean checkIfClientExists(Client client){
        return (clientDAO.selectforNameAndSenha(client) != null);
    }
    
}

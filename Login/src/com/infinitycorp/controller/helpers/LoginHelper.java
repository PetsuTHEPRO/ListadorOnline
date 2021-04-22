package com.infinitycorp.controller.helpers;

import com.infinitycorp.model.identity.Client;
import com.infinitycorp.view.Login;

public class LoginHelper {
    
    private final Login view;
    
    public LoginHelper(Login view){
        this.view = view;
    }
    
    public Client getModelo(){
        
        String userClient = view.getTxtClient().getText();
        String passwordClient = view.getTxtPassword().getText();
        
        Client modelClient = new Client(0, null, userClient, passwordClient, null);
        
        return modelClient;
        
    }
    
    public void setModelo(Client modelClient){
        
        String userClient = modelClient.getUser();
        String passwordClient = modelClient.getPassword();
        
        view.getTxtClient().setText(userClient);
        view.getTxtPassword().setText(passwordClient);
        
    }
    
    public void cleanScreen(){
        view.getTxtClient().setText("");
        view.getTxtPassword().setText("");
    }
    
}

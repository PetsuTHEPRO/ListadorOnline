/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.controller.helpers;

import com.infinitycorp.model.identity.Client;
import com.infinitycorp.view.Login;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author perge
 */
public class LoginHelper {
    
    private final Login view;
    
    public LoginHelper(Login view){
        this.view = view;
    }
    
    public Client getModelo(){
        String nameClient = view.getTxtClient().getText();
        String passwordClient = view.getTxtPassword().getText();
        
        Client modelClient = new Client(0, nameClient, passwordClient, null, null);
        
        return modelClient;
    }
    
    public void setModelo(Client modelClient){
        
        String nameClient = modelClient.getName();
        String passwordClient = modelClient.getPassword();
        
        view.getTxtClient().setText(nameClient);
        view.getTxtPassword().setText(passwordClient);
        
    }
    
    public void cleanScreen(){
        view.getTxtClient().setText("");
        view.getTxtPassword().setText("");
    }
    
}

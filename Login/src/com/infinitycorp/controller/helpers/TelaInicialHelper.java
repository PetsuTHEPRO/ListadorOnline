/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.controller.helpers;

import com.infinitycorp.model.identity.Client;
import com.infinitycorp.view.TelaInicial;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author perge
 */
public class TelaInicialHelper implements IHelper{
    
    private final TelaInicial view;
    
    public TelaInicialHelper(TelaInicial view){
        this.view = view;
    }

    @Override
    public Object getModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cleanScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setModelo(Client modelClient) {
        
        String nameClient = modelClient.getName();
        String lastNameClient = modelClient.getLastName();
        String userClient = modelClient.getUser();
        String emailClient = modelClient.getEmail();
        String passwordClient = modelClient.getPassword();
        Date dateClient = modelClient.getBirthDate();
                
        view.getTxtName().setText(nameClient);
        view.getTxtLastName().setText(lastNameClient);
        view.getTxtUser().setText(userClient);
        view.getTxtEmail().setText(emailClient);
        view.getTxtPassword().setText(passwordClient);
        view.getTxtformBirthDate().setText(new SimpleDateFormat("dd/MM/yyyy").format(dateClient));
        
    }
    
}

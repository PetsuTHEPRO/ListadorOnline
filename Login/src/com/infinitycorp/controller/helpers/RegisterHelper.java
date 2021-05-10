/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.controller.helpers;

import com.infinitycorp.model.identity.Client;
import com.infinitycorp.view.Register;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterHelper implements IHelper{
    
    private final Register view;
    
    public RegisterHelper(Register view){
        this.view = view;
    }
    
    // Funções Responsaveis no Get/Set/Clean dos Campos de cadastro
    
    public Client getModelo(){
        
        String nameClient = view.getTxtName().getText();
        String lastNameClient = view.getTxtLastName().getText();
        String userClient = view.getTxtUser().getText();
        String emailClient = view.getTxtEmail().getText();
        String passwordClient = view.getTxtPassword().getText();
        String dateClient = view.getTxtformBirthDate().getText();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        try {
            java.sql.Date data = new java.sql.Date(formato.parse(dateClient).getTime());
            
            Client modelClient = new Client(0, nameClient, lastNameClient, userClient, emailClient, passwordClient, data);
            return modelClient;
        } catch (ParseException ex) {
            System.out.println("Data Inserida invalida! Error: " + ex);
        }
        
        return null;
    }
    
    public void setModelo(Client modelClient){
        
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
    
    public void cleanScreen(){
        view.getTxtName().setText("");
        view.getTxtLastName().setText("");
        view.getTxtUser().setText("");
        view.getTxtPassword().setText("");
        view.getTxtformBirthDate().setText("__/__/____");
    }
    
    // Verificadores dos Campos (verificarSeCampoTaLimpo, verificarSeCampoTemNumero)
    
    public boolean checkIfFieldsIsEmpty(){
        
        String campo1 = view.getTxtName().getText();
        String campo2 = view.getTxtUser().getText();
        String campo3 = view.getTxtPassword().getText();
        String campo4 = view.getTxtformBirthDate().getText();
                
        return (campo1.isEmpty() || campo2.isEmpty() || campo3.isEmpty() || campo4.isEmpty());
    }
    
    public boolean checkNameHasNumber(){
        return view.getTxtName().getText().matches(".*\\d.*");
    }
    
}

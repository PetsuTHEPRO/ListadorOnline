/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.controller;

import com.infinitycorp.controller.helpers.RegisterHelper;
import com.infinitycorp.model.identity.Client;
import com.infinitycorp.model.service.ClientService;
import com.infinitycorp.view.Register;
import java.awt.Color;

/**
 *
 * @author perge
 */
public class RegisterController {
    
    private final Register view;
    private final RegisterHelper helper;
    private final ClientService clientService;
    
    public RegisterController(Register view) {
        this.view = view;
        this.helper = new RegisterHelper(view);
        this.clientService = new ClientService();
    }
    
    public void registerSystem(){
        
        Client clientController = helper.getModelo();

        if(!new ClientService().checkIfClientExists(clientController)){
            if(clientService.registerSucess(clientController)){
                showMessage("Cadastrado com sucesso!", Color.GREEN);
            }else{
                showMessage("Cadastro Falhou, tente mais tarde", Color.RED);
            }
        }else{
            showMessage("Usuário já cadastrado!", Color.RED);
        }
        
    }
    
    public void checkIfFieldsIsEmpty(){
        
        if(helper.checkIfFieldsIsEmpty()){
            this.registerSystem();
        }
        
        showMessage("Preenchar todos os campos!", Color.YELLOW);
    }
    
    public void showMessage(String msg, Color cor){
        this.view.showMessagePane(msg, cor);
    }
    
}

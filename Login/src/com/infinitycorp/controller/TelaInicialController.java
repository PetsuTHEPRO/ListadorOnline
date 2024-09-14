/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.controller;

import com.infinitycorp.controller.helpers.TelaInicialHelper;
import com.infinitycorp.model.DAO.ClientDAO;
import com.infinitycorp.model.identity.Client;
import com.infinitycorp.model.identity.MessageType;
import com.infinitycorp.model.identity.User;
import com.infinitycorp.model.service.UserService;
import com.infinitycorp.view.TelaInicial;
import javax.swing.JOptionPane;

public class TelaInicialController {
    
    private final TelaInicial view;
    private final TelaInicialHelper helper;
    private final Client modeloClient;
    private UserService userService;
    
    public TelaInicialController(TelaInicial view, Client clientDAO){
        this.view = view;
        this.helper = new TelaInicialHelper(view);
        this.userService = new UserService();
        this.modeloClient = clientDAO;
    }
    
    public void updateDataProfile(){
        helper.setModelo(new ClientDAO().selectForUser(modeloClient));
    }
    
     public void registerUser(){
         User user = helper.getModeloUser();
         boolean result = userService.registerSucess(user);
         
         if(result){
            TelaInicialController.showMessage(MessageType.SUCCESS, "Novo user do Instagram cadastrado com Sucesso!");
            helper.cleanScreenUser();
         }else{
            TelaInicialController.showMessage(MessageType.ERROR, "Falha ao cadastrar o user do Instagram!");
         }
    }
    
    public void inicializeProgram(){
        this.updateDataProfile();
    }
    
    public static void showMessage(MessageType type, String message) {
        JOptionPane.showMessageDialog(null, message, "Mensagem", type.getMessageType());
    }
}

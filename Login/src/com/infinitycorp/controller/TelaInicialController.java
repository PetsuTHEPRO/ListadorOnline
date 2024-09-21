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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
         
         if(helper.validateUserInput()){
            boolean hasUser = userInstagramExists(user.getName());
         
            if(!hasUser){
               boolean result = userService.registerSucess(user);

               if(result){
                  TelaInicialController.showMessage(MessageType.SUCCESS, "Novo user do Instagram cadastrado com Sucesso!");
                  helper.cleanScreenUser();
               }else{
                  TelaInicialController.showMessage(MessageType.ERROR, "Falha ao cadastrar o user do Instagram!");
               }

            }else{
                TelaInicialController.showMessage(MessageType.ERROR, "Usuário já existe!");
            }
         }else{
            TelaInicialController.showMessage(MessageType.ERROR, "Preencha todos os campos!");   
         }
   }
     
    public boolean userInstagramExists(String nameUser){
        User user = userService.selectUser(nameUser);
        
        return (user != null);
    }
     
    public void buscarUser(String nameUser){
        
        User user = userService.selectUser(nameUser);
        
        if(user != null){
            helper.setModeloUser(user);
        }else{
            TelaInicialController.showMessage(MessageType.ERROR, "Usuário não encontrado!");
        }
    }
    
    public void excluirUser(String nameUser, DefaultTableModel tabela){
        
        boolean result = userService.deleteUser(nameUser);
        
        if(result){
            TelaInicialController.showMessage(MessageType.SUCCESS, "Usuário deletado com sucesso!");
        }else{
            TelaInicialController.showMessage(MessageType.ERROR, "Usuário não encontrado!");
        }
        
        this.getUserAll(tabela);
    }
    
    public void inicializeProgram(DefaultTableModel tabela){
        this.updateDataProfile();
        this.getUserAll(tabela);
    }
    
    public static void showMessage(MessageType type, String message) {
        JOptionPane.showMessageDialog(null, message, "Mensagem", type.getMessageType());
    }

    public void limparCampoUserInstagram() {
        helper.cleanScreenUser();
    }

    public void editarUser() {
        User user = helper.getModeloUser();
         
         boolean hasUser = userInstagramExists(user.getName());
         
         if(hasUser){
             
            boolean result = userService.updateSucess(user);

            if(result){
               TelaInicialController.showMessage(MessageType.SUCCESS, "User do Instagram alterado com Sucesso!");
               helper.cleanScreenUser();
            }else{
               TelaInicialController.showMessage(MessageType.ERROR, "Falha ao alterar o User do Instagram!");
            }
         }else{
             TelaInicialController.showMessage(MessageType.ERROR, "Usuário não encontrado!");
         }
    }

    public void getUserAll(DefaultTableModel tabela) {
        List<User> users = userService.selectAllUserModel();
        
        tabela.setRowCount(0); // Limpa o modelo
        
        for (User user : users) {
            Object[] row = {
                user.getId(),
                user.getName(),
                user.getDescription(),
                user.isVisibility()? "Público": "Privado",
                user.isHasProfilePhoto()? "Sim" : "Não",
            };
            tabela.addRow(row); // Adiciona o novo usuário ao modelo
        }
        
    }
}

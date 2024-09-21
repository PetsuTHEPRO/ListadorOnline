/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.controller.helpers;

import com.infinitycorp.model.identity.Client;
import com.infinitycorp.model.identity.User;
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
    
    public void cleanScreenUser() {
        // Limpa os campos de texto
        view.getUserInstagramTxt().setText("");
        view.getDescricaotxt().setText("");

        // Restaura as caixas de seleção para valores padrão
        view.getVisibilidadeJBox().setSelectedIndex(0);
        view.getIsPhotoPerfil().setSelectedIndex(0);
        view.getAvatarBox().setSelectedItem("João");
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
    
    public User getModeloUser(){
        String userTxt = view.getUserInstagramTxt().getText();
        boolean visibilidadeTxt = (view.getVisibilidadeJBox().getSelectedItem().toString().equals("Público"));
        boolean photoPerfilTxt = (view.getIsPhotoPerfil().getSelectedItem().toString().equals("Sim"));
        String descricaoTxt = view.getDescricaotxt().getText();
        String avatar = view.getAvatarBox().getSelectedItem().toString();
        int avatarNumber = 0;
        
        switch(avatar){
        
            case "João":
                avatarNumber = 1;
            break;
            
            case "Maria":
                avatarNumber = 2;
            break;
            
            
            case "André":
                avatarNumber = 3;
            break;
            
            
            case "Julia":
                avatarNumber = 4;
            break;
            
            
            case "Robot":
                avatarNumber = 5;
            break;
        }
        
        return new User(-1, userTxt, descricaoTxt, visibilidadeTxt, photoPerfilTxt, avatarNumber);
    }

    public void setModeloUser(User modelUser) {
        
        String nameUser = modelUser.getName();
        String description = modelUser.getDescription();
        int visibility = (modelUser.isVisibility()? 0 : 1);
        int hasProfilePhoto = (modelUser.isHasProfilePhoto()? 0 : 1);
        int avatar = modelUser.getAvatar();
                
        view.getUserInstagramTxt().setText(nameUser);
        view.getDescricaotxt().setText(description);
        
        
        view.getVisibilidadeJBox().setSelectedIndex(visibility);
        view.getIsPhotoPerfil().setSelectedIndex(hasProfilePhoto);
        
        view.getAvatarBox().setSelectedIndex(avatar - 1);
    }
    
    public boolean validateUserInput() {
        String userTxt = view.getUserInstagramTxt().getText().trim();
        String descricaoTxt = view.getDescricaotxt().getText().trim();

        // Verifica se o nome do usuário está vazio
        if (userTxt.isEmpty()) {
            return false;
    }

        // Verifica se a descrição está vazia
        if (descricaoTxt.isEmpty()) {
            return false;
        }

        // Se todos os campos estão válidos
        return true;
    }
    
}

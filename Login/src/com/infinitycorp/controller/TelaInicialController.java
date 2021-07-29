/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.controller;

import com.infinitycorp.controller.helpers.TelaInicialHelper;
import com.infinitycorp.model.DAO.ClientDAO;
import com.infinitycorp.model.identity.Client;
import com.infinitycorp.view.TelaInicial;

public class TelaInicialController {
    
    private final TelaInicial view;
    private final TelaInicialHelper helper;
    private final Client modeloClient;
    
    public TelaInicialController(TelaInicial view, Client clientDAO){
        this.view = view;
        this.helper = new TelaInicialHelper(view);
        this.modeloClient = clientDAO;
    }
    
    public void updateDataProfile(){
        helper.setModelo(new ClientDAO().selectForUser(modeloClient));
    }
    
    public void inicializeProgram(){
        this.updateDataProfile();
    }
    
}

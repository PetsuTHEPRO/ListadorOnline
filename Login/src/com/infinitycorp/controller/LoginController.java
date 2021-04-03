
package com.infinitycorp.controller;

import com.infinitycorp.view.Login;
import com.infinitycorp.controller.helpers.LoginHelper;
import com.infinitycorp.model.identity.Client;
import com.infinitycorp.model.service.ClientService;
import java.awt.Color;
import java.sql.SQLException;

public class LoginController {
    
    private final Login view;
    private final LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void loginSystem() throws SQLException{
        
        Client clientController = helper.getModelo();
        System.out.println(clientController.getUser());
        boolean cService = new ClientService().checkIfClientExists(clientController);
        
        if(cService){
            showMessage("Logado com sucesso!", Color.GREEN);
        }else{
            showMessage("Usuário ou senha estão incorretos!", Color.RED);
        }
    }
    
    public void checkIfFieldsIsEmpty() throws SQLException{
        
        String campo1 = view.getTxtClient().getText();
        String campo2 = view.getTxtPassword().getText();
        
        if(campo1.isEmpty() && campo2.isEmpty()){
            showMessage("Preenchar todos os campos!", Color.YELLOW);
        }else{
            
            this.loginSystem();
        }
        
    }
    
    public void showMessage(String msg, Color cor){
        this.view.showMessagePane(msg, cor);
    }
    
    
    
}

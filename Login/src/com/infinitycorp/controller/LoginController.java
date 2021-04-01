
package com.infinitycorp.controller;

import com.infinitycorp.view.Login;
import com.infinitycorp.controller.helpers.LoginHelper;
import com.infinitycorp.model.identity.Client;
import java.awt.Color;

public class LoginController {
    
    private final Login view;
    private final LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void loginSystem(){
        
        Client clientController = helper.getModelo();
        
    }
    
    public void checkIfFieldsIsEmpty(){
        
        String campo1 = view.getTxtClient().getText();
        String campo2 = view.getTxtPassword().getText();
        
        if(campo1.isEmpty() && campo2.isEmpty()){
            showMessage("Preenchar todos os campos!", Color.YELLOW);
        }
        
    }
    
    public void showMessage(String msg, Color cor){
        this.view.showMessagePane(msg, cor);
    }
    
    
    
}

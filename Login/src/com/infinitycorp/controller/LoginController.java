
package com.infinitycorp.controller;

import com.infinitycorp.view.Login;
import com.infinitycorp.controller.helpers.LoginHelper;
import com.infinitycorp.model.identity.Client;

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
    
    public void showMessage(){
        this.view.showMessagePane("Preenchar todos os campos!");
    }
    
    
    
}

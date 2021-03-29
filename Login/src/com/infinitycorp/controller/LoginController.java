
package com.infinitycorp.controller;

import com.infinitycorp.view.Login;

public class LoginController {
    
    private final Login view;
    
    public LoginController(Login view) {
        this.view = view;
    }
    
    public void showMessage(){
        this.view.showMessagePane("Preenchar todos os campos!");
    }
    
    
    
}

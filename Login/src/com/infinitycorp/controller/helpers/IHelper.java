/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.controller.helpers;

import com.infinitycorp.model.identity.Client;

/**
 *
 * @author perge
 */
public interface IHelper {
    
    public abstract void setModelo(Client modelClient);
    
    public abstract Object getModelo();
    
    public abstract void cleanScreen();
}

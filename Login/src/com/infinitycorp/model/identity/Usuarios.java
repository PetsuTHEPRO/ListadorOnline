/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.model.identity;

/**
 *
 * @author perge
 */
public class Usuarios {
   
    private String name;
    private String description;
    private boolean visibility;
    private int avatar;

    public Usuarios(String name, String description, boolean visibility, int avatar) {
        this.name = name;
        this.description = description;
        this.visibility = visibility;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
    
}

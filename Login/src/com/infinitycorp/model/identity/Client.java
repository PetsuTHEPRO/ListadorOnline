package com.infinitycorp.model.identity;

import java.util.Date;

public class Client {
    
    private int id;
    private String name;
    private String user; 
    private String password;
    private Date birthDate;

    public Client(int id, String name, String user, String password, Date birthDate) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.password = password;
        this.birthDate = birthDate;
    }

    public Client() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
}

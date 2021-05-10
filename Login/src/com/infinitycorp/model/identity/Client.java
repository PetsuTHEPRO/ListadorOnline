package com.infinitycorp.model.identity;

import java.util.Date;

public class Client {
    
    private int id;
    private String name;
    private String lastName;
    private String user; 
    private String email;
    private String password;
    private Date birthDate;

    public Client(int id, String name, String lastName, String user, String email, String password, Date birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.user = user;
        this.email = email;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

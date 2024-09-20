package com.infinitycorp.model.service;

import com.infinitycorp.model.DAO.UserDAO;
import com.infinitycorp.model.identity.User;

public class UserService {
    
    private final UserDAO userDAO;
  
    public UserService() {
          this.userDAO = new UserDAO();
    }

    public boolean registerSucess(User user){
        return (userDAO.insertUser(user) != false);
    }
    
    public User selectUser(String user){
        return (userDAO.selectForUser(user));
    }
    
    public boolean updateSucess(User user){
        return (userDAO.updateUser(user) != false);
    }
    
}

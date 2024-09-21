package com.infinitycorp.model.DAO;

import com.infinitycorp.model.identity.User;
import java.util.List;

public class UserDAO extends GenericDAO{
    
    public boolean insertUser(User user){
        
        String sql = "INSERT INTO `user` (id, name, description, visibility, has_profile_photo, avatar) VALUES (NULL,?,?,?,?,?);";
        
        return insertGeneric(sql, user.getName(), user.getDescription(), user.isVisibility(), user.isHasProfilePhoto(), user.getAvatar());
        
    }
    
    public User selectForUser(String userName){
        String sql = "SELECT * FROM `user` WHERE `name` LIKE ?";
        
        return selectGenericUser(sql, userName);
    }
    
    public List<User> selectAllUser(){
        String sql = "SELECT * FROM `user`;";
        return selectGenericUsers(sql);
    }
    
    public boolean updateUser(User user) {

        String sql = "UPDATE `user` SET description = ?, visibility = ?, has_profile_photo = ?, avatar = ? WHERE name = ?;";

        return updateGeneric(sql, user.getDescription(), user.isVisibility(), user.isHasProfilePhoto(), user.getAvatar(), user.getName());
    }

    public boolean deleteUser(String nameUser) {
        
        String sql = "DELETE FROM `user` WHERE name = ?;";
        
        return deleteGeneric(sql, nameUser);
    }
    
}

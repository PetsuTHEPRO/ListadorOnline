package com.infinitycorp.model.identity;

public class User {
   
    private int id;
    private String name;
    private String description;
    private boolean visibility;
    private boolean hasProfilePhoto;
    private int avatar;

    public User(){
    }
    
    public User(int id, String name, String description, boolean visibility, boolean hasProfilePhoto, int avatar) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.visibility = visibility;
        this.hasProfilePhoto = hasProfilePhoto;
        this.avatar = avatar;
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

    public boolean isHasProfilePhoto() {
        return hasProfilePhoto;
    }

    public void setHasProfilePhoto(boolean hasProfilePhoto) {
        this.hasProfilePhoto = hasProfilePhoto;
    }
    
    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
    
}

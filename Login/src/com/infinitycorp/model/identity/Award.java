package com.infinitycorp.model.identity;

import java.util.Date;

public class Award {
    
    private String nameAward;
    private String description;
    
    
    public Award(String nameAward, Date dateAward, String description) {
        this.nameAward = nameAward;
        this.description = description;
    }
    
}

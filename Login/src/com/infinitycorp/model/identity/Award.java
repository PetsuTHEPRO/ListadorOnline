package com.infinitycorp.model.identity;

import java.util.Date;

public class Award extends Sweepstakes{
    
    protected String nameAward;
    
    public Award(String nameAward, String name, Date dateSweepstake, String description) {
        super(name, dateSweepstake, description);
        this.nameAward = nameAward;
    }
    
    
    
}

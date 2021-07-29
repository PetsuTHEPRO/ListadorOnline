package com.infinitycorp.model.identity;

import java.util.Date;

public class Sweepstakes {
    
    protected String name;
    private String ownerName;
    protected Date dateSweepstake;
    protected String description;

    public Sweepstakes(String name, String ownerName,Date dateSweepstake, String description) {
        this.name = name;
        this.ownerName = ownerName;
        this.dateSweepstake = dateSweepstake;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getDateSweepstake() {
        return dateSweepstake;
    }

    public void setDateSweepstake(Date dateSweepstake) {
        this.dateSweepstake = dateSweepstake;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.model.identity;

import java.util.Date;

/**
 *
 * @author junior nuness
 */
public class Delivery extends Sweepstakes{
    
    protected Date dateDelivery;
    protected String situation;

    public Delivery(Date dateDelivery, String name, Date dateSweepstake, String description) {
        super(name, dateSweepstake, description);
        this.dateDelivery = dateDelivery;
    }

    public Date getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }
      
}

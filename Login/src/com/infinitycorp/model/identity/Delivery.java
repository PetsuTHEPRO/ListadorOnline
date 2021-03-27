
package com.infinitycorp.model.identity;

import java.util.Date;

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

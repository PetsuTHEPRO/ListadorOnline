
package com.infinitycorp.model.identity;

import java.util.Date;

public class Delivery{
    
    private int codeDelivery; 
    private Date dateDelivery;
    private String situation;

    public Delivery(int codeDelivery, Date dateDelivery, String situation){
        this.codeDelivery = codeDelivery;
        this.dateDelivery = dateDelivery;
        this.situation = situation;
    }

    public Date getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }
      
}

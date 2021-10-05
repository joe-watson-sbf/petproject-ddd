package co.com.sofka.petproject.domain.customer.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.petproject.domain.customer.value.Status;
import co.com.sofka.petproject.domain.customer.value.ShippementDate;
import co.com.sofka.petproject.domain.customer.value.ShippementNo;

public class Shippement extends Entity<ShippementNo> {
    private Status status;
    private ShippementDate shippementDate;

    public Shippement(ShippementNo entityId, Status status, ShippementDate shippementDate) {
        super(entityId);
        this.status = status;
        this.shippementDate = shippementDate;
    }

    public Shippement shippement(){
        return this;
    }

    public Status checkShippement(){
        return this.status;
    }


    public Status receiveStatus() {
        return status;
    }

    public void changeReceiveStatus(Status status) {
        this.status = status;
    }

    public ShippementDate shippementDate() {
        return shippementDate;
    }

    public void changeShippementDate(ShippementDate shippementDate) {
        this.shippementDate = shippementDate;
    }
}

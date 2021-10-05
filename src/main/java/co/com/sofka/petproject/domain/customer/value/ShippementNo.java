package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.Identity;

public class ShippementNo extends Identity {
    public ShippementNo(String id){
        super(id);
    }

    public ShippementNo of(String id){
        return new ShippementNo(id);
    }
}

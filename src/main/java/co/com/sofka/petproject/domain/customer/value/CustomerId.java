package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.Identity;

public class CustomerId extends Identity {
    public CustomerId(String id){
        super(id);
    }

    public CustomerId of(String id){
        return new CustomerId(id);
    }
}

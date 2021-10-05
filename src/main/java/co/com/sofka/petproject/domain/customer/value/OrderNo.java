package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.Identity;

public class OrderNo extends Identity {

    public OrderNo(String id) {
        super(id);
    }

    public OrderNo of(String id){
        return new OrderNo(id);
    }

}

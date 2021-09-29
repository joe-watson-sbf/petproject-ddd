package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.Identity;

public class PaymentMetodId extends Identity {
    public PaymentMetodId(){}

    public PaymentMetodId(String id){
        super(id);
    }

    public static PaymentMetodId of(String id){
        return new PaymentMetodId(id);
    }
}

package co.com.sofka.petproject.domain.customer;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.petproject.domain.customer.value.Address;
import co.com.sofka.petproject.domain.customer.value.CardExpirationDate;
import co.com.sofka.petproject.domain.customer.value.Method;
import co.com.sofka.petproject.domain.customer.value.PaymentMetodId;

public class PaymentMethod extends Entity<PaymentMetodId> {

    private Address address;
    private CardExpirationDate expirationDate;
    private Method method;

    public PaymentMethod(PaymentMetodId entityId) {
        super(entityId);
    }


}

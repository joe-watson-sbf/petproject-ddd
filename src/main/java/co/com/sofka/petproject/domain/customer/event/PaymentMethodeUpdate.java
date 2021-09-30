package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;

public class PaymentMethodeUpdate extends DomainEvent {
    public PaymentMethodeUpdate(String type) {
        super(type);
    }
}

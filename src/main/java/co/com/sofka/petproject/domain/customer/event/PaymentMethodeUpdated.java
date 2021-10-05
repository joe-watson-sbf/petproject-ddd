package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;

public class PaymentMethodeUpdated extends DomainEvent {
    public PaymentMethodeUpdated(String type) {
        super(type);
    }
}

package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;

public class PaymentMethodAdded extends DomainEvent {
    public PaymentMethodAdded(String type) {
        super(type);
    }
}

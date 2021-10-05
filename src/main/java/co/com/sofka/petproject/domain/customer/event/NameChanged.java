package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;

public class NameChanged extends DomainEvent {
    public NameChanged(String type) {
        super(type);
    }
}

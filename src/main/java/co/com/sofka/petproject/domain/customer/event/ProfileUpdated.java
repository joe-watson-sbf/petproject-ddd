package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;

public class ProfileUpdated extends DomainEvent {
    public ProfileUpdated(String type) {
        super(type);
    }
}

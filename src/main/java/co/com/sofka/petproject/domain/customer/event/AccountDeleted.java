package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;

public class AccountDeleted extends DomainEvent {
    public AccountDeleted(String type) {
        super(type);
    }
}

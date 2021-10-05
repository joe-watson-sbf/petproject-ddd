package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.stock.value.Name;

public class CustomerCreated extends DomainEvent {

    private final Name name;

    public CustomerCreated(Name name) {
        super("co.com.sofka.petproject.customer.ordercanceled");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}

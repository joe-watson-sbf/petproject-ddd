package co.com.sofka.petproject.domain.stock.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.stock.value.Name;
import co.com.sofka.petproject.domain.stock.value.StockId;

public class StockCreated extends DomainEvent {
    private final Name name;

    public StockCreated(Name name) {
        super("co.com.sofka.petproject.stock.created");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}

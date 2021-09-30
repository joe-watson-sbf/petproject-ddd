package co.com.sofka.petproject.domain.stock.event;

import co.com.sofka.domain.generic.DomainEvent;

public class StockCreated extends DomainEvent {
    public StockCreated(String type) {
        super(type);
    }
}

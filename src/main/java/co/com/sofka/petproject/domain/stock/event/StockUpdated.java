package co.com.sofka.petproject.domain.stock.event;

import co.com.sofka.domain.generic.DomainEvent;

public class StockUpdated extends DomainEvent {
    public StockUpdated(String type) {
        super(type);
    }
}

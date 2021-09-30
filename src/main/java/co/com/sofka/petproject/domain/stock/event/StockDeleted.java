package co.com.sofka.petproject.domain.stock.event;

import co.com.sofka.domain.generic.DomainEvent;

public class StockDeleted extends DomainEvent {
    public StockDeleted(String type) {
        super(type);
    }
}

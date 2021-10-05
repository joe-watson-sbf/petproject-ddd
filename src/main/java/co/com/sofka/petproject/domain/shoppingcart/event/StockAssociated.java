package co.com.sofka.petproject.domain.shoppingcart.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.stock.value.StockId;

public class StockAssociated extends DomainEvent {
    private final StockId stockId;

    public StockAssociated(StockId stockId) {
        super("co.com.sofka.petproject.shoppingcart.stockassociated");
        this.stockId = stockId;
    }

    public StockId getStockId() {
        return stockId;
    }
}

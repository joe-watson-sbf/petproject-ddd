package co.com.sofka.petproject.domain.stock;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.petproject.domain.stock.value.StockId;

public class Stock extends AggregateEvent<StockId> {


    public Stock(StockId stockId) {
        super(stockId);
    }
}

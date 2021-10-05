package co.com.sofka.petproject.domain.stock.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.petproject.domain.stock.value.Name;
import co.com.sofka.petproject.domain.stock.value.StockId;

public class CreateStock extends Command {
    private final StockId stockId;
    private final Name name;

    public CreateStock(StockId stockId, Name name) {
        this.stockId = stockId;
        this.name = name;
    }

    public StockId getStockId() {
        return stockId;
    }

    public Name getName() {
        return name;
    }
}

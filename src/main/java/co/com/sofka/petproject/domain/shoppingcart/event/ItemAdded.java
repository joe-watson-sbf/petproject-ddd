package co.com.sofka.petproject.domain.shoppingcart.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.stock.value.ProductId;
import co.com.sofka.petproject.domain.stock.value.StockId;

public class ItemAdded extends DomainEvent {
    private final StockId stockId;
    private final ProductId productId;


    public ItemAdded(StockId stockId, ProductId productId) {
        super("co.com.sofka.petprojject.shoppingcart.itemadded");
        this.stockId = stockId;
        this.productId = productId;
    }

    public StockId getStockId() {
        return stockId;
    }

    public ProductId getProductId() {
        return productId;
    }
}

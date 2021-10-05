package co.com.sofka.petproject.domain.shoppingcart.command;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.shoppingcart.value.ShoppingCartId;
import co.com.sofka.petproject.domain.stock.value.ProductId;
import co.com.sofka.petproject.domain.stock.value.StockId;

public class AddItem extends DomainEvent {
    private final ShoppingCartId shoppingCartId;
    private final StockId stockId;
    private final ProductId productId;


    public AddItem(ShoppingCartId shoppingCartId, StockId stockId, ProductId productId) {
        super("co.com.sofka.petprojject.shoppingcart.itemadded");
        this.shoppingCartId = shoppingCartId;
        this.stockId = stockId;
        this.productId = productId;
    }

    public StockId getStockId() {
        return stockId;
    }

    public ProductId getProductId() {
        return productId;
    }

    public ShoppingCartId getShoppingCartId() {
        return shoppingCartId;
    }
}

package co.com.sofka.petproject.domain.shoppingcart.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.petproject.domain.shoppingcart.value.ShoppingCartId;
import co.com.sofka.petproject.domain.stock.value.StockId;

public class AssociateStock extends Command {
    private final ShoppingCartId shoppingCartId;
    private final StockId stockId;

    public AssociateStock(ShoppingCartId shoppingCartId, StockId stockId) {
        this.shoppingCartId = shoppingCartId;

        this.stockId = stockId;
    }

    public StockId getStockId() {
        return stockId;
    }

    public ShoppingCartId getShoppingCartId() {
        return shoppingCartId;
    }
}

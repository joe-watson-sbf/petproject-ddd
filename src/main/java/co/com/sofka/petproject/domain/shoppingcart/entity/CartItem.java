package co.com.sofka.petproject.domain.shoppingcart.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.petproject.domain.shoppingcart.value.CartItemId;
import co.com.sofka.petproject.domain.stock.value.ProductId;
import co.com.sofka.petproject.domain.stock.value.StockId;

public class CartItem extends Entity<CartItemId>{
    private StockId stockId;
    private ProductId productId;


    public CartItem(CartItemId entityId, StockId stockId, ProductId productId) {
        super(entityId);
        this.stockId = stockId;
        this.productId = productId;
    }

    public StockId stockId() {
        return stockId;
    }

    public void changeStockId(StockId stockId) {
        this.stockId = stockId;
    }

    public ProductId productId() {
        return productId;
    }

    public void changeProductId(ProductId productId) {
        this.productId = productId;
    }
}

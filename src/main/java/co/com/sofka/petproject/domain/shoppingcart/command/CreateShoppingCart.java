package co.com.sofka.petproject.domain.shoppingcart.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.petproject.domain.shoppingcart.value.CartTotalPrice;
import co.com.sofka.petproject.domain.shoppingcart.value.ShoppingCartId;
import co.com.sofka.petproject.domain.shoppingcart.value.TotalItems;

public class CreateShoppingCart extends Command {
    private final ShoppingCartId shoppingCartId;
    private final TotalItems totalItems;
    private final CartTotalPrice totalPrice;

    public CreateShoppingCart(ShoppingCartId shoppingCartId, TotalItems totalItems, CartTotalPrice totalPrice) {
        this.shoppingCartId = shoppingCartId;
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
    }

    public TotalItems getTotalItems() {
        return totalItems;
    }

    public CartTotalPrice getTotalPrice() {
        return totalPrice;
    }

    public ShoppingCartId getShoppingCartId() {
        return shoppingCartId;
    }
}

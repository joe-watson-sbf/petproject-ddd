package co.com.sofka.petproject.domain.shoppingcart.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.petproject.domain.shoppingcart.value.CartItemId;
import co.com.sofka.petproject.domain.shoppingcart.value.ShoppingCartId;

public class RemoveItem extends Command {
    private final ShoppingCartId shoppingCartId;
    private final CartItemId cartItemId;

    public RemoveItem(ShoppingCartId shoppingCartId, CartItemId cartItemId) {
        this.shoppingCartId = shoppingCartId;
        this.cartItemId = cartItemId;
    }

    public CartItemId getCartItemId() {
        return cartItemId;
    }

    public ShoppingCartId getShoppingCartId() {
        return shoppingCartId;
    }
}

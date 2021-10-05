package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.shoppingcart.value.CartItemId;
import co.com.sofka.petproject.domain.shoppingcart.value.ShoppingCartId;

public class OrderPlaced extends DomainEvent {
    private final ShoppingCartId shoppingCartId;
    private final CartItemId cartItemId;

    public OrderPlaced(ShoppingCartId shoppingCartId, CartItemId cartItemId) {
        super("co.com.sofka.petproject.customer.orderpalced");
        this.shoppingCartId = shoppingCartId;
        this.cartItemId = cartItemId;
    }

    public ShoppingCartId getShoppingCartId() {
        return shoppingCartId;
    }

    public CartItemId getCartItemId() {
        return cartItemId;
    }
}

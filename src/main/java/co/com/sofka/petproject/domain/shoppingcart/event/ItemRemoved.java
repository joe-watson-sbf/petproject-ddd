package co.com.sofka.petproject.domain.shoppingcart.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.shoppingcart.value.CartItemId;

public class ItemRemoved extends DomainEvent {
    private final CartItemId cartItemId;

    public ItemRemoved(CartItemId cartItemId) {
        super("co.com.sofka.petprojject.shoppingcart.itemaremoved");
        this.cartItemId = cartItemId;
    }

    public CartItemId getCartItemId() {
        return cartItemId;
    }
}

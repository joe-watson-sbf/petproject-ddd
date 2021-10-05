package co.com.sofka.petproject.domain.shoppingcart.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.shoppingcart.value.CartTotalPrice;
import co.com.sofka.petproject.domain.shoppingcart.value.TotalItems;

public class ShoppingCartCreated extends DomainEvent {
    private final TotalItems totalItems;
    private final CartTotalPrice totalPrice;

    public ShoppingCartCreated(TotalItems totalItems, CartTotalPrice totalPrice) {
        super("co.com.sofka.petproject.shoppingcart.created");
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
    }

    public TotalItems getTotalItems() {
        return totalItems;
    }

    public CartTotalPrice getTotalPrice() {
        return totalPrice;
    }
}

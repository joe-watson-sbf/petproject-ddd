package co.com.sofka.petproject.domain.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.petproject.domain.customer.value.OrderNo;
import co.com.sofka.petproject.domain.shoppingcart.value.CartItemId;
import co.com.sofka.petproject.domain.shoppingcart.value.ShoppingCartId;

public class PlaceOrder extends Command {
    private final OrderNo orderNo;
    private final ShoppingCartId shoppingCartId;
    private final CartItemId cartItemId;

    public PlaceOrder(OrderNo orderNo, ShoppingCartId shoppingCartId, CartItemId cartItemId) {
        this.orderNo = orderNo;
        this.shoppingCartId = shoppingCartId;
        this.cartItemId = cartItemId;
    }

    public ShoppingCartId getShoppingCartId() {
        return shoppingCartId;
    }

    public CartItemId getCartItemId() {
        return cartItemId;
    }

    public OrderNo getOrderNo() {
        return orderNo;
    }
}

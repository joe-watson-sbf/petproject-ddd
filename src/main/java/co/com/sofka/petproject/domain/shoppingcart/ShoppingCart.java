package co.com.sofka.petproject.domain.shoppingcart;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.customer.value.OrderNo;
import co.com.sofka.petproject.domain.shoppingcart.entity.CartItem;
import co.com.sofka.petproject.domain.shoppingcart.event.ItemAdded;
import co.com.sofka.petproject.domain.shoppingcart.event.ItemRemoved;
import co.com.sofka.petproject.domain.shoppingcart.event.ShoppingCartCreated;
import co.com.sofka.petproject.domain.shoppingcart.event.StockAssociated;
import co.com.sofka.petproject.domain.shoppingcart.value.CartItemId;
import co.com.sofka.petproject.domain.shoppingcart.value.CartTotalPrice;
import co.com.sofka.petproject.domain.shoppingcart.value.ShoppingCartId;
import co.com.sofka.petproject.domain.shoppingcart.value.TotalItems;
import co.com.sofka.petproject.domain.stock.value.ProductId;
import co.com.sofka.petproject.domain.stock.value.StockId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class ShoppingCart extends AggregateEvent<ShoppingCartId> {
    protected StockId stockId;
    protected Set<CartItem> cartItems;
    protected TotalItems totalItems;
    protected CartTotalPrice totalPrice;


    public ShoppingCart(ShoppingCartId entityId, TotalItems totalItems, CartTotalPrice totalPrice) {
        super(entityId);
        appendChange(new ShoppingCartCreated(totalItems, totalPrice)).apply();
    }

    private ShoppingCart(ShoppingCartId shoppingCartId){
        super(shoppingCartId);
        subscribe(new ShoppingCartChange(this));
    }

    public static ShoppingCart from(ShoppingCartId shoppingCartId, List<DomainEvent> events){
        var shoppingCart = new ShoppingCart(shoppingCartId);
        events.forEach(shoppingCart::applyEvent);
        return shoppingCart;
    }

    public void associateStock(StockId stockId){
        Objects.requireNonNull(stockId);
        appendChange(new StockAssociated(stockId)).apply();
    }

    public void addItem(StockId stockId, ProductId productId){
        Objects.requireNonNull(stockId);
        Objects.requireNonNull(productId);

        appendChange(new ItemAdded(stockId, productId)).apply();
    }

    public Optional<CartItem> findItemById(CartItemId cartItemId){
        return cartItems.stream()
                .filter(cartItem -> cartItem.identity().equals(cartItemId))
                .findFirst();
    }

    public void removeItem(CartItemId cartItemId){
        Objects.requireNonNull(cartItemId);
        appendChange(new ItemRemoved(cartItemId)).apply();
    }



    public StockId stockId() {
        return stockId;
    }

    public void changeStockId(StockId stockId) {
        this.stockId = stockId;
    }

    public Set<CartItem> cartItems() {
        return cartItems;
    }

    public void changeCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public TotalItems totalItems() {
        return totalItems;
    }

    public void changeTotalItems(TotalItems totalItems) {
        this.totalItems = totalItems;
    }

    public CartTotalPrice totalPrice() {
        return totalPrice;
    }

    public void changeTotalPrice(CartTotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }
}

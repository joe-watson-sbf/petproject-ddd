package co.com.sofka.petproject.domain.shoppingcart;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.petproject.domain.shoppingcart.event.ItemAdded;
import co.com.sofka.petproject.domain.shoppingcart.event.ItemRemoved;
import co.com.sofka.petproject.domain.shoppingcart.event.ShoppingCartCreated;
import co.com.sofka.petproject.domain.shoppingcart.event.StockAssociated;

import java.util.HashSet;

public class ShoppingCartChange extends EventChange {
    public ShoppingCartChange(ShoppingCart shoppingCart){

        apply((ShoppingCartCreated event)->{
            shoppingCart.cartItems = new HashSet<>();
        });

        apply((StockAssociated event)->{
            shoppingCart.stockId = event.getStockId();
        });

        apply((ItemAdded event)->{
            shoppingCart.addItem(event.getStockId(), event.getProductId());
        });

        apply((ItemRemoved event)->{
            shoppingCart.removeItem(event.getCartItemId());
        });


    }
}

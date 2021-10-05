package co.com.sofka.petproject.domain.shoppingcart.value;

import co.com.sofka.domain.generic.Identity;

public class CartItemId extends Identity {
    public CartItemId(String id){
        super(id);
    }
    public CartItemId of(String id){
        return new CartItemId(id);
    }
}

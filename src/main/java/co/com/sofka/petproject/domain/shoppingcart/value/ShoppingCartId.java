package co.com.sofka.petproject.domain.shoppingcart.value;

import co.com.sofka.domain.generic.Identity;

public class ShoppingCartId extends Identity {

    public ShoppingCartId(String id){
        super(id);
    }

    public ShoppingCartId of(String id){
        return new ShoppingCartId(id);
    }
}

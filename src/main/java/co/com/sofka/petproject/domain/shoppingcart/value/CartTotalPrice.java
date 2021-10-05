package co.com.sofka.petproject.domain.shoppingcart.value;

import co.com.sofka.domain.generic.ValueObject;

public class CartTotalPrice implements ValueObject<String> {
    private final String value;

    public CartTotalPrice(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}

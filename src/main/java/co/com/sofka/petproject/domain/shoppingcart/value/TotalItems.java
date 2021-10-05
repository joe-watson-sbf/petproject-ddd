package co.com.sofka.petproject.domain.shoppingcart.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalItems implements ValueObject<Integer> {
    private final Integer value;

    public TotalItems(Integer value) {
        this.value = Objects.requireNonNull(value, "The id cannot be null!!!");
    }

    @Override
    public Integer value() {
        return value;
    }
}

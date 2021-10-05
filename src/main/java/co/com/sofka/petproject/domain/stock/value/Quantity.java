package co.com.sofka.petproject.domain.stock.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Quantity implements ValueObject<Integer> {
    private final Integer value;

    public Quantity(Integer value) {
        this.value = Objects.requireNonNull(value, "The product quantity can't be null!!!");
        if(this.value<=0){
            throw new IllegalArgumentException("The product quantity can't be less than 1 !!!");
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}
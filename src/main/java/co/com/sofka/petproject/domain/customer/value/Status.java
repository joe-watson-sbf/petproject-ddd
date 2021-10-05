package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Status implements ValueObject<String> {
    private final String value;
    public Status(String value){
        this.value= Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}

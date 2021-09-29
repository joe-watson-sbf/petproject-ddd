package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Method implements ValueObject<String> {
    private final String value;

    public Method(String value) {
        this.value = Objects.requireNonNull(value.trim(), "Invalid method!!!");
    }

    @Override
    public String value() {
        return value;
    }
}

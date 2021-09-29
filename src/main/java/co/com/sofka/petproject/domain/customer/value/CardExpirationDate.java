package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CardExpirationDate implements ValueObject<String> {

    private final String value;

    public CardExpirationDate(String value) {
        this.value = Objects.requireNonNull(value.trim(), "Address cannot be null!!!");
    }

    @Override
    public String value() {
        return value;
    }
}

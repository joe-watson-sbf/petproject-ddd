package co.com.sofka.petproject.domain.stock.value;

import co.com.sofka.domain.generic.ValueObject;

public class Name implements ValueObject<String> {
    private final String value;

    public Name(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}

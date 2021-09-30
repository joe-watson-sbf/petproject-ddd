package co.com.sofka.petproject.domain.User.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FullName implements ValueObject<String> {
    private final String value;

    public FullName(String value) {
        this.value = Objects.requireNonNull(value.trim(), "Fullname cannot be empty!!!");
        if(this.value.length()<6){
            throw new IllegalArgumentException("Fullname must have at least six characters!!!");
        }
    }


    @Override
    public String value() {
        return value;
    }
}

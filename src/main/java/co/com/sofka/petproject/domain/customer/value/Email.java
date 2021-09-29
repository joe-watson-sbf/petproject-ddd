package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {
    private final String value;

    public Email(String value) {
        this.value = Objects.requireNonNull(value.trim(), "Your email address cannot be null!!!");
        if(!(this.value.contains("@") && this.value.contains(".")) || this.value.length()<8){
            throw new IllegalArgumentException("Invalid email: " + value);
        }

    }

    @Override
    public String value() {
        return value;
    }

}

package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Active implements ValueObject<Boolean> {
    private final boolean active;

    public Active(boolean active) {
        this.active = Objects.requireNonNullElse(active, true);
    }

    @Override
    public Boolean value() {
        return active;
    }
}

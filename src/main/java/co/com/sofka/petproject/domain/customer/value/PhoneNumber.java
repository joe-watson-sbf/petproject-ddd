package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

public class PhoneNumber implements ValueObject {
    private final String value;

    /**
     * The phone number is an optional data
     * */
    public PhoneNumber(String value) {
        this.value = value;
    }

    @Override
    public Object value() {
        return value;
    }
}

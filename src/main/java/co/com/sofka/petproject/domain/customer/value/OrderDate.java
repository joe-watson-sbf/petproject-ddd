package co.com.sofka.petproject.domain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Calendar;
import java.util.Objects;

public class OrderDate implements ValueObject<Calendar> {
    private final Calendar value;

    public OrderDate(Calendar value){
        this.value= Objects.requireNonNull(value);
    }

    @Override
    public Calendar value() {
        return value;
    }
}
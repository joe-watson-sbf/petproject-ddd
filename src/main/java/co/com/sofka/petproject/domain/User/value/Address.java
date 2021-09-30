package co.com.sofka.petproject.domain.User.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Address implements ValueObject<String> {

    private final String contry;
    private final String state;
    private final String street;
    private final String city;
    private final String zipCode;

    public Address(String contry, String state, String street, String city, String zipCode) {
        this.contry = Objects.requireNonNull(contry.trim(), "Country requiered!!!");
        this.state = Objects.requireNonNull(state.trim(), "State requiered!!!");
        this.street = Objects.requireNonNull(street.trim(), "Street requiered!!!");
        this.city = Objects.requireNonNull(city.trim(), "City requiered!!!");
        this.zipCode = Objects.requireNonNull(zipCode.trim(), "Zip Code requiered!!!");
    }

    @Override
    public String value() {
        return this.street + ", "+ this.city + ", " +
                this.state + ", " + this.contry + ", " + this.zipCode;
    }
}

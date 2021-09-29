package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.customer.value.Address;
import co.com.sofka.petproject.domain.customer.value.Email;
import co.com.sofka.petproject.domain.customer.value.FullName;
import co.com.sofka.petproject.domain.customer.value.PhoneNumber;

public class CustomerCreated extends DomainEvent {
    protected FullName fullName;
    protected Email email;
    protected Address address;
    protected PhoneNumber phoneNumber;

    public CustomerCreated(FullName fullName, Email email, Address address, PhoneNumber phoneNumber) {
        super("co.com.sofka.customer.customercreated");
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Email getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}

package co.com.sofka.petproject.domain.User.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.User.value.Address;
import co.com.sofka.petproject.domain.User.value.Email;
import co.com.sofka.petproject.domain.User.value.FullName;
import co.com.sofka.petproject.domain.User.value.PhoneNumber;

public class UserCreated extends DomainEvent {
    protected FullName fullName;
    protected Email email;
    protected Address address;
    protected PhoneNumber phoneNumber;

    public UserCreated(FullName fullName, Email email, Address address, PhoneNumber phoneNumber) {
        super("co.com.sofka.user.usercreated");
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

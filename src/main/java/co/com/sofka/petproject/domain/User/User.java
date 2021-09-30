package co.com.sofka.petproject.domain.User;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.petproject.domain.User.event.UserCreated;
import co.com.sofka.petproject.domain.User.value.Address;
import co.com.sofka.petproject.domain.User.value.Email;
import co.com.sofka.petproject.domain.User.value.FullName;
import co.com.sofka.petproject.domain.User.value.PhoneNumber;
import co.com.sofka.petproject.domain.User.value.UserId;

public class User extends AggregateEvent<UserId> {

    protected FullName fullName;
    protected Email email;
    protected Address address;
    protected PhoneNumber phoneNumber;

    public User(UserId entityId, FullName fullName, Email email, Address address, PhoneNumber phoneNumber) {
        super(entityId);
        appendChange(new UserCreated(fullName, email, address, phoneNumber)).apply();
    }


    public User(UserId userId){
        super(userId);
        subscribe(new UserChange(this));
    }
}

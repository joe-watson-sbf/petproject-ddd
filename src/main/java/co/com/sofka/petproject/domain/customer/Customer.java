package co.com.sofka.petproject.domain.customer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.petproject.domain.User.value.UserId;


public class Customer extends AggregateEvent<UserId> {

    public Customer(UserId entityId) {
        super(entityId);
    }
}

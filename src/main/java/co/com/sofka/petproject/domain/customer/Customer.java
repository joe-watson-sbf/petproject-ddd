package co.com.sofka.petproject.domain.customer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.petproject.domain.customer.event.CustomerCreated;
import co.com.sofka.petproject.domain.customer.value.*;

import java.util.Set;

public class Customer extends AggregateEvent<CustomerId> {
    protected FullName fullName;
    protected Email email;
    protected Address address;
    protected PhoneNumber phoneNumber;
    protected Set<PaymentMethod> paymentMethod;


    public Customer(CustomerId customerId, FullName fullName, Email email,
                    Address address, PhoneNumber phoneNumber) {
        super(customerId);
        appendChange(new CustomerCreated(fullName, email, address, phoneNumber)).apply();
    }

    public Customer(CustomerId customerId){
        super(customerId);
        subscribe(new CustomerChange(this));
    }
}

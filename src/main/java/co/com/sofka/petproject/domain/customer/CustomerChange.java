package co.com.sofka.petproject.domain.customer;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.petproject.domain.customer.event.*;
import co.com.sofka.petproject.domain.stock.value.Name;

import java.util.HashSet;

public class CustomerChange extends EventChange {

    public CustomerChange(Customer customer){

        apply((CustomerCreated event)->{
            customer.name = event.getName();
            customer.orders = new HashSet<>();
            customer.shippements = new HashSet<>();
        });

        apply((NameChanged event)->{
            customer.changeName(new Name(event.getAggregateName()));
        });

        apply((OrderCanceled event)->{
            customer.cancelOrder(event.getOrderNo());
        });

        apply((OrderPlaced event)->{
            customer.placeOrder(event.getShoppingCartId(), event.getCartItemId());
        });

        apply((PaymentMethodAdded event)->{
            customer.addPaymentMethod(event.getExpirationDate(), event.getMethod());
        });
    }
}

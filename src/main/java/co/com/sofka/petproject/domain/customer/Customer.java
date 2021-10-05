package co.com.sofka.petproject.domain.customer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.customer.entity.PaymentMethod;
import co.com.sofka.petproject.domain.customer.entity.Shippement;
import co.com.sofka.petproject.domain.customer.event.CustomerCreated;
import co.com.sofka.petproject.domain.customer.event.OrderCanceled;
import co.com.sofka.petproject.domain.customer.event.OrderPlaced;
import co.com.sofka.petproject.domain.customer.event.PaymentMethodAdded;
import co.com.sofka.petproject.domain.customer.value.CardExpirationDate;
import co.com.sofka.petproject.domain.customer.value.CustomerId;
import co.com.sofka.petproject.domain.customer.value.Method;
import co.com.sofka.petproject.domain.customer.value.OrderNo;
import co.com.sofka.petproject.domain.shoppingcart.value.CartItemId;
import co.com.sofka.petproject.domain.shoppingcart.value.ShoppingCartId;
import co.com.sofka.petproject.domain.stock.value.Name;
import co.com.sofka.petproject.domain.stock.value.ProductId;
import co.com.sofka.petproject.domain.stock.value.StockId;
import org.springframework.core.annotation.Order;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Customer extends AggregateEvent<CustomerId> {
    protected Name name;
    protected ShoppingCartId shoppingCartId;
    protected PaymentMethod paymentMethod;
    protected Set<Order> orders;
    protected Set<Shippement> shippements;

    public Customer(CustomerId entityId, Name name) {
        super(entityId);
        appendChange(new CustomerCreated(name)).apply();
    }

    public Customer(CustomerId customerId){
        super(customerId);
        subscribe(new CustomerChange(this));
    }

    public static Customer from(CustomerId customerId, List<DomainEvent> events){
        var customer = new Customer(customerId);
        events.forEach(customer::applyEvent);
        return customer;
    }


    public void cancelOrder(OrderNo orderNo){
        Objects.requireNonNull(orderNo);
        appendChange(new OrderCanceled(orderNo)).apply();
    }

    public void placeOrder(ShoppingCartId shoppingCartId, CartItemId cartItemId){
        Objects.requireNonNull(shoppingCartId);
        Objects.requireNonNull(cartItemId);
        appendChange(new OrderPlaced(shoppingCartId, cartItemId));
    }

    public void addPaymentMethod(CardExpirationDate expirationDate, Method method){
        Objects.requireNonNull(expirationDate);
        Objects.requireNonNull(method);

        appendChange(new PaymentMethodAdded(expirationDate, method)).apply();
    }






    public Name name() {
        return name;
    }

    public void changeName(Name name) {
        this.name = name;
    }

    public ShoppingCartId shoppingCartId() {
        return shoppingCartId;
    }

    public void changeShoppingCartId(ShoppingCartId shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public PaymentMethod paymentMethod() {
        return paymentMethod;
    }

    public void changePaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Set<Order> orders() {
        return orders;
    }

    public void changeOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Shippement> shippements() {
        return shippements;
    }

    public void changeShippements(Set<Shippement> shippements) {
        this.shippements = shippements;
    }
}

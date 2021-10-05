package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.customer.value.CardExpirationDate;
import co.com.sofka.petproject.domain.customer.value.Method;

public class PaymentMethodAdded extends DomainEvent {
    private final CardExpirationDate expirationDate;
    private final Method method;

    public PaymentMethodAdded(CardExpirationDate expirationDate, Method method){
        super("co.com.sofka.petproject.customer.paymentmethodadded");
        this.expirationDate = expirationDate;
        this.method = method;
    }

    public CardExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public Method getMethod() {
        return method;
    }
}

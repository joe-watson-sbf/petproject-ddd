package co.com.sofka.petproject.domain.customer.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.petproject.domain.customer.value.CardExpirationDate;
import co.com.sofka.petproject.domain.customer.value.Method;
import co.com.sofka.petproject.domain.customer.value.PaymentMetodId;

public class PaymentMethod extends Entity<PaymentMetodId> {

    private CardExpirationDate expirationDate;
    private Method method;

    public PaymentMethod(PaymentMetodId paymentMetodId, CardExpirationDate expirationDate, Method method) {
        super(paymentMetodId);
    }

    public CardExpirationDate expirationDate() {
        return expirationDate;
    }

    public void changeExpirationDate(CardExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Method method() {
        return method;
    }

    public void changeMethod(Method method) {
        this.method = method;
    }
}

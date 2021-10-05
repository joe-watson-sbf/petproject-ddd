package co.com.sofka.petproject.domain.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.petproject.domain.customer.value.CardExpirationDate;
import co.com.sofka.petproject.domain.customer.value.Method;
import co.com.sofka.petproject.domain.customer.value.PaymentMetodId;

public class UpdatePaymentMethode extends Command {
    private final PaymentMetodId paymentMetodId;
    private final CardExpirationDate expirationDate;
    private final Method method;
    public UpdatePaymentMethode(PaymentMetodId paymentMetodId, CardExpirationDate expirationDate, Method method){
        this.paymentMetodId = paymentMetodId;
        this.expirationDate = expirationDate;
        this.method = method;
    }

    public PaymentMetodId getPaymentMetodId() {
        return paymentMetodId;
    }

    public CardExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public Method getMethod() {
        return method;
    }
}

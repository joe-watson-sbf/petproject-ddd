package co.com.sofka.petproject.domain.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.customer.value.OrderNo;

public class OrderCanceled extends DomainEvent {
    private OrderNo orderNo;

    public OrderCanceled(OrderNo orderNo) {
        super("co.com.sofka.petproject.customer.ordercanceled");
    }

    public OrderNo getOrderNo() {
        return orderNo;
    }
}

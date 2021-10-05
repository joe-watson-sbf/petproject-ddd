package co.com.sofka.petproject.domain.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.petproject.domain.customer.value.OrderNo;

public class CancelOrder extends Command {
    private OrderNo orderNo;

    public CancelOrder(OrderNo orderNo) {
        this.orderNo = orderNo;
    }

    public OrderNo getOrderNo() {
        return orderNo;
    }
}

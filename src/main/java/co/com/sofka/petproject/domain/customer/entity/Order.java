package co.com.sofka.petproject.domain.customer.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.petproject.domain.customer.value.*;

public class Order extends Entity<OrderNo> {
    private OrderDate orderDate;
    private Status status;
    private CustomerId customerId;
    private ShippementNo shippementNo;


    public Order(OrderNo entityId, OrderDate orderDate, Status status, CustomerId customerId, ShippementNo shippementNo) {
        super(entityId);
        this.orderDate = orderDate;
        this.status = status;
        this.customerId = customerId;
        this.shippementNo = shippementNo;
    }

    public OrderDate orderDate() {
        return orderDate;
    }

    public void changeOrderDate(OrderDate orderDate) {
        this.orderDate = orderDate;
    }

    public Status status() {
        return status;
    }

    public void changeStatus(Status status) {
        this.status = status;
    }

    public CustomerId customerId() {
        return customerId;
    }

    public void changeCustomerId(CustomerId customerId) {
        this.customerId = customerId;
    }

    public ShippementNo shippementNo() {
        return shippementNo;
    }

    public void changeShippementNo(ShippementNo shippementNo) {
        this.shippementNo = shippementNo;
    }
}

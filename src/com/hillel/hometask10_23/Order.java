package com.hillel.hometask10_23;

import java.time.LocalDateTime;

public class Order {
    public Order(OrderStatus status, LocalDateTime dateOfOrder){
        this.status = status;
        this.dateOfOrder = dateOfOrder;
    }
    OrderStatus status;

    public OrderStatus getStatus() {
        return status;
    }

    LocalDateTime dateOfOrder; // дата заказа
    LocalDateTime updateOfOrder; // дата обновления

}

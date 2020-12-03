package stratergy.udemy.service;

import stratergy.udemy.order.Order;

import java.util.Collection;

public interface OrderPrinter {
    void print(Collection<Order> orders);
}

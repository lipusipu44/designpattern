package observer.udemy.observer;

import observer.udemy.order.Order;

public interface OrderObserver {
    void updated(Order order);
}

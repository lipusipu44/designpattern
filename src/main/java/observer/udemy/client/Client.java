package observer.udemy.client;

import observer.udemy.observer.PriceObserver;
import observer.udemy.observer.QuantityObserver;
import observer.udemy.order.Order;

public class Client {
    public static void main(String[] args) {
        Order order=new Order("100");
        PriceObserver price = new PriceObserver();
        QuantityObserver quant = new QuantityObserver();
        order.attach(price);
        order.attach(quant);
        order.addItem(100);
        System.out.println(order);
        order.addItem(100);
        System.out.println(order);
    }
}

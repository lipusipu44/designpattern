package stratergy.udemy.service;

import stratergy.udemy.order.Order;

import java.util.Collection;
import java.util.LinkedList;

public class PrintService {
    private OrderPrinter orderPrinter;
    public PrintService(OrderPrinter orderPrinter) {
        this.orderPrinter=orderPrinter;
    }
    public void printOrder(LinkedList<Order> orders){
        orderPrinter.print(orders);
    }
}

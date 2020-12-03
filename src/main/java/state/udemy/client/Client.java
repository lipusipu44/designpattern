package state.udemy.client;

import state.udemy.order.Order;

public class Client {
    public static void main(String[] args) {
        Order order=new Order();
        order.delivered();
        order.cancel();
    }
}

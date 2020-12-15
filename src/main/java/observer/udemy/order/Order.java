package observer.udemy.order;

import observer.udemy.observer.OrderObserver;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private double shippingCost;
    private double itemCost;
    private double discount;
    private int count;

    private List<OrderObserver> orderObservers=new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver orderObserver){
        orderObservers.add(orderObserver);
    }

    public void detach(OrderObserver orderObserver){
        orderObservers.remove(orderObserver);
    }

    public void addItem(double price){
        itemCost+=price;
        count++;
        for (OrderObserver orderObserver:orderObservers) {
                orderObserver.updated(this);
        }
    }

    public double getTotal() {
        return itemCost - discount + shippingCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", shippingCost=" + shippingCost +
                ", itemCost=" + itemCost +
                ", discount=" + discount +
                ", count=" + count +
                '}';
    }
}

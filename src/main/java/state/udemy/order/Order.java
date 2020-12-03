package state.udemy.order;

import state.udemy.order_state.*;

public class Order {
    private OrderState orderState;

    public Order() {
        orderState=new New();
    }
    public void cancel(){
        orderState.handleCancellation();
        orderState=new Cancelled();
    }
    public void paymentSuccessful(){
        orderState=new Paid();
    }
    public void dispatched(){
        orderState=new InTransit();
    }
    public void delivered(){
        orderState=new Delivered();
    }
}

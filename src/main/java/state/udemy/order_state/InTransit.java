package state.udemy.order_state;

public class InTransit implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("In transit state. Cancellation chage: $ 20");
        return 20;
    }
}

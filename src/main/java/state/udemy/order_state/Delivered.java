package state.udemy.order_state;

public class Delivered implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("In Delivered state. Cancellation charge: $ 30");
        return 30;
    }
}

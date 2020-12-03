package state.udemy.order_state;

public class Paid implements OrderState{

    @Override
    public double handleCancellation() {
        System.out.println("In Paid state, cancellation charge to be paid:$ 10");
        return 10;
    }
}

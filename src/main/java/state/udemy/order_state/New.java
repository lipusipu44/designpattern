package state.udemy.order_state;

public class New implements OrderState{

    @Override
    public double handleCancellation() {
        System.out.println("New State, so no cancellation charge");
        return 0;
    }
}

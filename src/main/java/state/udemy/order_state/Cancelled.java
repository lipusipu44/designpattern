package state.udemy.order_state;

public class Cancelled implements OrderState {

    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cancelled Order..Can't cancel anymore");
    }
}

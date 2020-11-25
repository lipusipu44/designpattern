package adapter.classAdapter;

public class BusinessCardDesigner {
    private String card;

    public String getCard() {
        return card;
    }

    public void setCard(Customer customer) {
        this.card = customer.getName()+"\n"
        +customer.getDesignation()+"\n"+
        customer.getAddress();
    }
}

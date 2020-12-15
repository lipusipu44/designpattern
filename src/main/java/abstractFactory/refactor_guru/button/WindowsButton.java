package abstractFactory.refactor_guru.button;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have clicked on a Windows button");
    }
}

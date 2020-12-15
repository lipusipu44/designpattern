package abstractFactory.refactor_guru.button;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created a Mac Button");
    }
}

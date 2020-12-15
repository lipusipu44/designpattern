package abstractFactory.refactor_guru.checkboxes;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created a Mac Checkbox");
    }
}

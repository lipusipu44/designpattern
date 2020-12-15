package abstractFactory.refactor_guru.checkboxes;

public class WindowsCheckBox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created a Windows Checkbox");
    }
}

package abstractFactory.refactor_guru.factory;

import abstractFactory.refactor_guru.button.Button;
import abstractFactory.refactor_guru.button.WindowsButton;
import abstractFactory.refactor_guru.checkboxes.Checkbox;
import abstractFactory.refactor_guru.checkboxes.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckBox();
    }
}

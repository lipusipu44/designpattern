package abstractFactory.refactor_guru.factory;

import abstractFactory.refactor_guru.button.Button;
import abstractFactory.refactor_guru.button.MacOSButton;
import abstractFactory.refactor_guru.checkboxes.Checkbox;
import abstractFactory.refactor_guru.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}

package abstractFactory.refactor_guru.factory;

import abstractFactory.refactor_guru.button.Button;
import abstractFactory.refactor_guru.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}

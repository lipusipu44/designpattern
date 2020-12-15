package factoryMethod.refactor_guru.factory;

import factoryMethod.refactor_guru.buttons.Button;
import factoryMethod.refactor_guru.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

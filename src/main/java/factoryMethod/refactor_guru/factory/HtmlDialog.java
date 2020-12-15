package factoryMethod.refactor_guru.factory;

import factoryMethod.refactor_guru.buttons.Button;
import factoryMethod.refactor_guru.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

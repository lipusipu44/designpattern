package abstractFactory.refactor_guru.demo;

import abstractFactory.refactor_guru.button.Button;
import abstractFactory.refactor_guru.checkboxes.Checkbox;
import abstractFactory.refactor_guru.factory.GUIFactory;

public class App {
    private Button button;
    private Checkbox checkbox;
    public App(GUIFactory guiFactory) {
        this.button=guiFactory.createButton();
        this.checkbox=guiFactory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}

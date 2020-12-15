package factoryMethod.refactor_guru.factory;

import factoryMethod.refactor_guru.buttons.Button;

public abstract class Dialog {
    public void render(){
        Button button=createButton();
        button.render();
    }

    public abstract Button createButton();
}

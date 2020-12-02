package mediator.udemy.uicontrol;

public interface UIControl {
    void controlChanged(UIControl uiControl);
    String getControlValue();
    String getControlName();
}

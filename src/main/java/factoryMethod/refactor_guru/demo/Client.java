package factoryMethod.refactor_guru.demo;

import factoryMethod.refactor_guru.factory.Dialog;
import factoryMethod.refactor_guru.factory.HtmlDialog;
import factoryMethod.refactor_guru.factory.WindowsDialog;

public class Client {
    public static void main(String[] args) {
        Dialog dialog=new HtmlDialog();
        dialog.render();
        Dialog dialog1=new WindowsDialog();
        dialog1.render();
    }
}

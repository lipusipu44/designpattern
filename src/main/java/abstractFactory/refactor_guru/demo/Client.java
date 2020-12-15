package abstractFactory.refactor_guru.demo;

import abstractFactory.refactor_guru.factory.MacOSFactory;
import abstractFactory.refactor_guru.factory.WindowsFactory;

public class Client {
    public static void main(String[] args) {
        App app=new App(new MacOSFactory());
        app.paint();
        app=new App(new WindowsFactory());
        app.paint();
        System.out.println();
    }
}

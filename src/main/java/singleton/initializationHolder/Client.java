package singleton.initializationHolder;

public class Client {
    public static void main(String[] args) {
        InitializationHolder initializationHolder=InitializationHolder.getInitializationHolder();
        InitializationHolder initializationHolder1=InitializationHolder.getInitializationHolder();
        System.out.println(initializationHolder==initializationHolder1);
    }
}

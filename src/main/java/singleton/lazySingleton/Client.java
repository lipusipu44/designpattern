package singleton.lazySingleton;

public class Client {
    public static void main(String[] args) {
        LazySingleton lazySingleton=LazySingleton.getLazySingleton();
        LazySingleton lazySingleton1=LazySingleton.getLazySingleton();
        System.out.println(lazySingleton==lazySingleton1);
    }
}

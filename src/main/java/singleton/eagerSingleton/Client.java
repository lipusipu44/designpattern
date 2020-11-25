package singleton.eagerSingleton;

public class Client {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton=EagerSingleton.getEagerSingleton();
        EagerSingleton eagerSingleton1=EagerSingleton.getEagerSingleton();
        System.out.println(eagerSingleton==eagerSingleton1);
    }
}

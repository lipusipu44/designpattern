package singleton.eagerSingleton;

public class EagerSingleton {
    private EagerSingleton(){
    }
    private static final EagerSingleton EAGER_SINGLETON=new EagerSingleton();
    public static EagerSingleton getEagerSingleton(){
        return EAGER_SINGLETON;
    }

}

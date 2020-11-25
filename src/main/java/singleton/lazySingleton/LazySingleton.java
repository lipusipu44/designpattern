package singleton.lazySingleton;

public class LazySingleton {
    private LazySingleton(){

    }
    private static volatile LazySingleton LAZY_SINGLETON;

    public static LazySingleton getLazySingleton(){
        if(LAZY_SINGLETON==null){
            synchronized (LazySingleton.class){
                if(LAZY_SINGLETON==null){
                    LAZY_SINGLETON=new LazySingleton();
                }
            }
        }
        return LAZY_SINGLETON;
    }
}

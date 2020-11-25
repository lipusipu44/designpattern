package singleton.initializationHolder;

public class InitializationHolder {
    private InitializationHolder() {
    }

    private static class InnerClassCaller{
        private static InitializationHolder INSTANCE=new InitializationHolder();
    }

    public static InitializationHolder getInitializationHolder(){
        return InnerClassCaller.INSTANCE;
    }
}

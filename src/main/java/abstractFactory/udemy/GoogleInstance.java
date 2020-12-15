package abstractFactory.udemy;

public class GoogleInstance implements Instance{
    private Size size;
    public GoogleInstance(Size size) {
        System.out.println("Initiating Google Instance");
        this.size=size;
    }

    @Override
    public void start() {
        System.out.println("Starting Google Instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Google Instance");
    }

    @Override
    public void run() {
        System.out.println("Running Google Instance");
    }

    @Override
    public void storageAttach(Storage storage){
        System.out.println("Storage attached for Google");
    }
}

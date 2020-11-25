package abstractFactory;

public class Client {

    private AbstractFactory factoryCaller;

    public Client(AbstractFactory factoryCaller) {
        this.factoryCaller = factoryCaller;
    }

    public Instance buildInstance(Instance.Size size, String id) {
        Instance instance = factoryCaller.createInstance(size);
        Storage storage = factoryCaller.createStorage(id);
        instance.storageAttach(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client client = new Client(new AwsAbstractFactory());
        Instance instance = client.buildInstance(Instance.Size.MICRO, "10");
        instance.start();
    }

}

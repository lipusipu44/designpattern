package abstractFactory;

public class GoogleAbstractFactory implements AbstractFactory{
    @Override
    public Instance createInstance(Instance.Size size) {
        return new GoogleInstance(size);
    }

    @Override
    public Storage createStorage(String id) {
        return new GoogleStorage(id);
    }
}

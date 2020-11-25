package abstractFactory;

public interface AbstractFactory {
    Instance createInstance(Instance.Size size);
    Storage createStorage(String id);

}

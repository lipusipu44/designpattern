package abstractFactory.udemy;

public class AwsAbstractFactory implements AbstractFactory{
    @Override
    public Instance createInstance(Instance.Size size) {
        return new AwsInstance(size);
    }

   @Override
    public Storage createStorage(String id) {
        return new S3Storage(id);
    }
}

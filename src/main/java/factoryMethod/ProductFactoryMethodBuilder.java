package factoryMethod;

public class ProductFactoryMethodBuilder extends PostFactoryMethodBuilder{
    @Override
    public Post postBuilder() {
        return new ProductPost();
    }
}

package factoryMethod;

public class NewsFactoryMethodBuilder extends PostFactoryMethodBuilder{
    @Override
    public Post postBuilder() {
        return new NewsPost();
    }
}

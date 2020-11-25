package factoryMethod;

public class BlogFactoryMethodBuilder extends PostFactoryMethodBuilder{
    @Override
    public Post postBuilder() {
        return new BlogPost();
    }
}

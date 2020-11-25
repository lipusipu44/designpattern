package factoryMethod;

public abstract class PostFactoryMethodBuilder {

    public void build(){
        Post post=postBuilder();
        System.out.println(post);
    }

    protected abstract Post postBuilder();
}

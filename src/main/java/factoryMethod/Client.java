package factoryMethod;

public class Client {

    public static void main(String[] args) {
        Post post=methodBuilder(new BlogFactoryMethodBuilder());
        post=methodBuilder(new NewsFactoryMethodBuilder());
    }

    public static Post methodBuilder(PostFactoryMethodBuilder postFactoryMethodBuilder){
        postFactoryMethodBuilder.build();
        return postFactoryMethodBuilder.postBuilder();
    }
}

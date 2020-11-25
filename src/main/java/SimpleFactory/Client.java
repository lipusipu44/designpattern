package SimpleFactory;

public class Client {

    public static void main(String[] args) {
        Post post=PostFactory.createPost("news");
        System.out.println(post.toString());
        post=PostFactory.createPost("blog");
        System.out.println(post);
        post=PostFactory.createPost("product");
        System.out.println(post);
        post=PostFactory.createPost("abc");
        System.out.println(post);
    }
}

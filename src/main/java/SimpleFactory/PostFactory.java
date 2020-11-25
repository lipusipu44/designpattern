package SimpleFactory;

public class PostFactory {

    public static Post createPost(String typePost) {
        switch (typePost) {
            case "news":
                return new NewsPost();
            case "blog":
                return new BlogPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalStateException("Unexpected value: " + typePost);
        }
    }

}

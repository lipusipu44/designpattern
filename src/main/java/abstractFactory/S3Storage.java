package abstractFactory;

public class S3Storage implements Storage{
    private String id;
    public S3Storage(String id) {
        this.id=id;
    }

    @Override
    public String getId() {
        System.out.println("Getting the Id for S3Storage");
        return id;
    }
}

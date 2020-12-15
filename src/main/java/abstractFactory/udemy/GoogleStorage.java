package abstractFactory.udemy;

public class GoogleStorage implements Storage{
    private String id;
    public GoogleStorage(String id) {
        this.id=id;
    }

    @Override
    public String getId() {
        System.out.println("Getting the Google Storage id");
        return id;
    }
}

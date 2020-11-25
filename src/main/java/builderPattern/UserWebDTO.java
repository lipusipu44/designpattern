package builderPattern;

public class UserWebDTO implements UserDTO {

    private String name;
    private String address;
    private String age;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "UserWebDTO{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", age='" + getAge() + '\'' +
                '}';
    }
}

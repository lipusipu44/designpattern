package builderPattern;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserWebDTOBuilder implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private String todayAsString;
    private String address;
    private UserDTO userDto;

    @Override
    public UserDTOBuilder getFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder getLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder getBirthDate(Date BirthDay) {
        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);
        this.todayAsString = df.format(BirthDay);
        return this;
    }

    @Override
    public UserDTOBuilder getAddress(Address address) {
        this.address = address.getCity() + ":" + address.getHouseNumber() + ":"
                + address.getState() + ":" + address.getStreet() + ":" + address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        userDto = new UserWebDTO();
        userDto.setName(this.firstName + " " + this.lastName);
        userDto.setAge(this.todayAsString);
        userDto.setAddress(this.address);

        return userDto;
    }
}

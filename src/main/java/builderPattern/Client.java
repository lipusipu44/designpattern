package builderPattern;

import java.util.Calendar;

public class Client {

    public static void main(String[] args) {
        User user = userCreator();
        UserDTO userDTO = builderCaller(new UserWebDTOBuilder(), user);
        System.out.println(userDTO);
    }

    public static UserDTO builderCaller(UserDTOBuilder userDTOBuilder, User user) {
        return userDTOBuilder.getFirstName(user.getFirstName()).
                getLastName(user.getLastName()).getBirthDate(user.getBirthDate()).
                getAddress(user.getAddress()).build();
    }

    public static User userCreator() {
        Address address = new Address();
        address.setCity("Berhampur");
        address.setHouseNumber("1");
        address.setState("Odisha");
        address.setStreet("ShantiNagar");
        address.setZipCode("760004");

        User user = new User();
        user.setAddress(address);
        user.setBirthDate(Calendar.getInstance().getTime());
        user.setFirstName("Anil");
        user.setLastName("Patro");

        return user;
    }

    ;
}

package builderPatternImmutable;

import java.util.Calendar;

public class Client {

    public static void main(String[] args) {
        UserWebDTO userDTO= createUser(UserWebDTO.getDTOBuilder(),userBuilder());
        userDTO.toString();
        System.out.println(userDTO);
    }

    public static UserWebDTO createUser(UserWebDTO.UserWebDTOBuilder userDTOBuilder, User user){
        UserWebDTO userWebDTO= userDTOBuilder.getAddress(user.getAddress()).
                getdateOfBirth(user.getDateofBirth()).getFirstName(user.getFirstName()).getLastName(user.getLastName()).build();
        return userWebDTO;
    }

    public static User userBuilder(){
        Address address=new Address();
        address.setCity("Bangalore");
        address.setHouseNumber("A 205");
        address.setState("Karnataka");
        address.setStreet("SVS Palms1");
        address.setZipCode("560037");

        User user=new User();
        user.setAddress(address);
        user.setDateofBirth(Calendar.getInstance().getTime());
        user.setFirstName("Anil");
        user.setLastName("Patro");

        return user;
    }
}

package builderPattern;

import java.util.Date;

public interface UserDTOBuilder {

    UserDTOBuilder getFirstName(String firstName);

    UserDTOBuilder getLastName(String lastName);

    UserDTOBuilder getBirthDate(Date BirthDay);

    UserDTOBuilder getAddress(Address address);

    UserDTO build();

}

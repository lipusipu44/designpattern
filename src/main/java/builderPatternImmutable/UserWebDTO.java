package builderPatternImmutable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserWebDTO {
    private String fullName;
    private String address;
    private String dateofBirth;

    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    @Override
    public String toString() {
        return "UserWebDTO{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", dateofBirth='" + dateofBirth + '\'' +
                '}';
    }

    public static UserWebDTOBuilder getDTOBuilder(){
        return new UserWebDTOBuilder();
    }

    public static class UserWebDTOBuilder{
        private String firstName;
        private String lastName;
        private String addressString;
        private String dateOfBirth;
        private UserWebDTO userWebDTO;


        public UserWebDTOBuilder getFirstName(String firstName) {
            this.firstName=firstName;
            return this;
        }


        public UserWebDTOBuilder getLastName(String lastName) {
            this.lastName=lastName;
            return this;
        }


        public UserWebDTOBuilder getAddress(Address address) {
            this.addressString=address.toString();
            return this;
        }


        public UserWebDTOBuilder getdateOfBirth(Date dateofBirth) {
            String pattern = "MM/dd/yyyy HH:mm:ss";
            DateFormat df = new SimpleDateFormat(pattern);
            this.dateOfBirth = df.format(dateofBirth);
            return this;
        }

        public UserWebDTO build() {
            this.userWebDTO=new UserWebDTO();
            userWebDTO.setFullName(this.firstName+" "+this.lastName);
            userWebDTO.setDateofBirth(this.dateOfBirth);
            userWebDTO.setAddress(this.addressString);
            return this.userWebDTO;
        }
    }

}



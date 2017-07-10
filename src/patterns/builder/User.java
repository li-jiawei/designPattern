package patterns.builder;

/**
 * Created by Jiawei on 7/10/17.
 */
public class User {
    // Required
    private String userName;
    private String emailAddress;

    // Optional
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String address;

    private User (Builder builder) {
        userName = builder.userName;
        emailAddress = builder.emailAddress;
        firstName = builder.firstName;
        lastName = builder.lastName;
        phoneNumber = builder.phoneNumber;
        address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        // Required
        private String userName;
        private String emailAddress;

        // Optional
        private String firstName;
        private String lastName;
        private int phoneNumber;
        private String address;

        public Builder(String userName, String emailAddress) {
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

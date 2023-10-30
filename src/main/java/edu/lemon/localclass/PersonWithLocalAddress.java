package edu.lemon.localclass;

public class PersonWithLocalAddress {
    private String firstName;
    private String lastName;
    private String phone;

    private interface Address {
        String getStreet();
        int getHouse();
    }

    public PersonWithLocalAddress(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    public String getAddress(int houseNumber, String street) {
        return "";
    }

    public Address getAddress(String street, int houseNumber) {
        return new Address() { // 1. create anonymous class, that implement interface Address.
                               // 2. Create object by anonymous class
            @Override
            public String getStreet() {
                return street;
            }

            @Override
            public int getHouse() {
                return houseNumber;
            }

            @Override
            public String toString() {
                return String.format("Address: %s, %s, %s", houseNumber, street, phone);
            }
        };
    }

    @Override
    public String toString() {
        return "PersonWithLocalAddress{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

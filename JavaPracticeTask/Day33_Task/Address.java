package Day33_Task;

public class Address {

        public String street, city, state, zipCode;
        public int buildingNumber;
        public static String country="Canada";
        public static String planet="Earth";

        public Address(String street, String city, String state, String zipCode, int buildingNumber) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.buildingNumber = buildingNumber;
        }

        @Override
        public String toString() {
            return buildingNumber+" "+street+"\n"+city+" "+state +", "+ zipCode;

        }
    }


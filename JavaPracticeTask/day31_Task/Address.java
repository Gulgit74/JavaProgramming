package day31_Task;

public class Address {
    /*2. Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012


     */


    public int BuildingNumber;
    public String street,city, state;
    //public String city;
   // public String state;
    public int zipCode;

    public Address(int buildingNumber, String street, String city, String state, int zipCode) {
        BuildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {  //you can change the address from here
        return "Address{" +
                "BuildingNumber=" + BuildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }


    public class AddressObject {
       // public static void main(String[] args) {

        }
    }



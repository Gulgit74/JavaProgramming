package day05_Concatenation;

public class PhoneNumber {

  /*  1. create a class named Phone Number and declare the following variables:
    countryCode, areaCode, localNumber

    use string concatenation to display the phone number

    ex:
            if  countryCode = 1
    areaCode = 703
    localNumber = 4512625

    output:
            +1(703)-4512625

   */



    public static void main(String[] args) {
        String countryCode = "+1";
        String areaCode ="(703)";
        String  localNumber = "4512625";
        String phoneNumber = (countryCode + areaCode + "-" + localNumber);

        System.out.print(phoneNumber);











    }









}
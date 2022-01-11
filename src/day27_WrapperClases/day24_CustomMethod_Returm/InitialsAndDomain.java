package day27_WrapperClases.day24_CustomMethod_Returm;
import java.util.Arrays;
import java.util.Scanner;

public class InitialsAndDomain {

    public static void main(String[] args) {
//1. Create a method that can display the initials of the person
        initials("Wooden", "Spoon"); // W.S
        domain("Cydeo.School@com");
    }

    /* 1. Create a method that can display the initials of the person

    2. Create a method that can display the domain of the email
    */
    public static void initials(String firstName, String lastName) {
        Scanner scan = new Scanner(System.in);
        scan.close();
        //1. Create a method that can display the initials of the person
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        initial = initial.toUpperCase();

        System.out.println("initial =" + initial);

        //System.out.println("Hello World!");// useless right now.we cannot use next time
        System.out.println("-------------------------------------");

    }

    // 2. Create a method that can display the domain of the email.domain(String email)
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain=" + domain);
        System.out.println("------------------------");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", " Gulsen@gmail.com"};
        //String[] emails = "";
         //for (String email : emails) {
        domain(email);
    }
    // System.out.println("------------------");


}

    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)













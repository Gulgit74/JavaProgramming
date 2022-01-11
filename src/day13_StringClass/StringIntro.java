package day13_StringClass;
import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name == name2); //false true
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);

        System.out.println("-----------------------------------------");

        String n1 = new String("Java");
        String n2 =  new String("Java");

        System.out.println(n1 == n2);
        System.out.println(n1);
        System.out.println(n2);

// String name = "wooden spoon"; //immutable
        System.out.println("------------------------------");

        name = name.toUpperCase(); // when we assign the variable, then Upper cae print.
        System.out.println(" --------------------------------");
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println( s1.equals(s2));

        String s3 = "Java";
        String s4 = new String("java");

        System.out.println(s3.equals(s4));

scan.close();

    }
}

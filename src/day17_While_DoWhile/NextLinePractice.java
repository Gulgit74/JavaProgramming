package day17_While_DoWhile;

import java.util.Scanner;
public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// enter

        System.out.println("Enter your age");
            int age = input.nextInt();

            input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA");
        double gpa = input.nextDouble();

        input.nextLine();
        System.out.println("School name");
        //String schoolName = "Jericho";
        input.nextLine();

input.close();





    }



}

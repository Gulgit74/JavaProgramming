package day17_While_DoWhile;

import  java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your Programming Language");
        String programingName = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("fullName =" + fullName);
        System.out.println("programingName =" + programingName);
        System.out.println("age =" + age);
        System.out.println("schoolName =" + schoolName);



input.close();

    }
}

package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first word:");
            String firstWord = scan.next();

            System.out.println("Enter second word:");
            String secondWord = scan.next();

            char f = firstWord.charAt(0);
            char s = secondWord.charAt(0);

            firstWord = firstWord.toUpperCase();
            secondWord= secondWord.toUpperCase();

            String initials = firstWord.charAt(0) + "." + secondWord.charAt(0);
            System.out.println("initials =" + initials);

            scan.close();
        }

    }

/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S
                Note: Pay attention to the example output
 */









package day20_ArraysIntro_Assigments;

import java.util.Scanner;
import java.util.Arrays;
public class Classmates {
    public static void main(String[] args) {
   /*     1. create an array named classmates, and store 10 of your classmates' full names
        print the initials of each classmates in separate lines

        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter full names of classmates");
        String[] classMates = {"Ece Erken", "Sinem Kaya", "Shopia Key", "Sevgul Tanriverdi", "Nesibe Sabanci", "Koray Basoglu", "Aynur Fidan", "Ozgul Sonmez", "John Real", "Melek Gul" };
        String result = "";
        for (int i = 0; i < classMates.length; i++) {
            classMates[i] = scan.nextLine();
            System.out.println(classMates[i].charAt(0) + "" + classMates[i].charAt((classMates[i].indexOf(" ")) + 1));
        }
        System.out.println(classMates);*/
        Scanner scan = new Scanner(System.in);
        int size = 10;
        String classmates[] = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + ". classmate");
            classmates[i] = scan.nextLine();


            System.out.println(classmates[i].charAt(0) + "." + classmates[i].charAt((classmates[i].indexOf(" ") )+ 1));
        }

        System.out.println(Arrays.toString(classmates));
        scan.close();
    }
}









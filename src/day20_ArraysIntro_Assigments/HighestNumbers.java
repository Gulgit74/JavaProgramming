package day20_ArraysIntro_Assigments;
import java.util.Arrays;
import java.util.Scanner;

public class HighestNumbers {
    public static void main(String[] args) {

        System.out.println("Enter 10 number:");
        Scanner input = new Scanner(System.in);
        int[] listOfNumbers = {1,2,3,45,678,123,234,2553,87654,65};
        int count = 0;
        int highest = 0;

        for (int i = 0; i < listOfNumbers.length; i++) {

            if (listOfNumbers[i] > highest) {
                highest = listOfNumbers[i];


            }

        }

       System.out.println(Arrays.toString(listOfNumbers));
        System.out.println("Highest number is: " + highest);
        input.close();
    }

}
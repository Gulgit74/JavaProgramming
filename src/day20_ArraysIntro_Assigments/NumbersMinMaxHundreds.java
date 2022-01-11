package day20_ArraysIntro_Assigments;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersMinMaxHundreds {
    public static void main(String[] args) {

        /* Tasks:
    1. create an array that has the numbers 1 to 100
    2. create an array that has the numbers 100 to 1
    3. Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number
            int num1[] = new int [100];
        for (int i = 0,j=num1.length; i<=num1.length && j>=1; i++ ,j--) {
            num1[i]=j;
        }
        System.out.println(Arrays.toString(num1));
}}
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;

        }

        System.out.println(Arrays.toString(num));

        System.out.println("---------------------------------");

        for (int i = 0, j = num.length; i < num.length - 1 && j >= 0; i++, j--) {

            num[i] = j;
        }
        System.out.println(Arrays.toString(num));


        System.out.println("----------------------");


        int[] num1 = new int[10];
        int frequency = 0;
        for (int i = 0; i < num.length; i++) {

            System.out.println("Enter a number 10 times");
            num1[i] = scan.nextInt();

            frequency++;
            //num[i] = i + 1;
scan.close();
            if (frequency == 10) {
                System.out.println(Arrays.toString(num1));
                break;

            }
        }
    }

}




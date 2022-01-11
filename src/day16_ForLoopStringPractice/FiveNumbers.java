package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FiveNumbers {

    public static void main(String[] args) {
       /*
S
        1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative */

        System.out.println("Enter the numbers:");
        Scanner in = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 1; i <= 5; i++) {
            int num = in.nextInt();

            if (num > 0) {
                positive++;

            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }


            System.out.println("Positive: " + positive + "\nNegative: " + negative + "\nzero:" + zero);

            in.close();
        }
    }
}







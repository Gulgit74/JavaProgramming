package day20_ArraysIntro;

import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();

            if (numbers[i] > max) {
                max = numbers[i];

            if(numbers[i] <min){
                min = numbers[i];


            }
                //int max = numbers[0];
                //int min = numbers[0];


                    }

//scan.close();
                }
        System.out.println("max =" + max);
        System.out.println("min =" + min);
            }


        }




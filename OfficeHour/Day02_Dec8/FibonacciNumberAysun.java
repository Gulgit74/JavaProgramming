package Day02_Dec8;

import java.util.Scanner;

public class FibonacciNumberAysun {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonacci number do you wan to see");

        int number = input.nextInt();
        int num1 =0;
        int num2 =1;
        int result = 0;

        System.out.println(num1);
        System.out.println(num2);

        for(int i = 2; i< number; i++){
            result = num1+num2;
            System.out.println(result);
            num1 = num2;
            num2 = result;
        }
    }
}

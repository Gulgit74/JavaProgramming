package Methods;

import java.util.Scanner;

public class SumOf3Nums {


    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int sum = 0;


        System.out.println("Enter 3 numbers");

        System.out.println("Sum of nummbers: "+(num1+num2+num3));
scan.close();

    }

}


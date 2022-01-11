package day20_ArraysIntro;

import java.util.Arrays;

public class ArrayzMonths {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(Arrays.toString(months));

        int number = 1;

        if (number < 1 || number > 12) {
            System.err.println("Invalid Number");
            System.exit(0);
        /*    System.out.println("---------------------------");
            for(int i=0; i < months.length; i++){
                System.out.println(months[i]);*/

                System.out.println("-----------------------");
                for(int i = months.length-1; i>=0; i--  ){
                    System.out.println(months[i]);
            }

        }
    }
}
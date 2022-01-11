package day17_While_DoWhile;

//import java.util.Scanner;

public class NumberOfDays {

    public static void main(String[] args) {
        int year = 2000;
        int number = 9;
        String result = " ";

        if (number >= 1 && number <= 12) { //1~12
            switch (number) {
                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days";

                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;

                default:
                    // case 1: case 3: case 5: case 7: case 10:
                    result = "31 days";
            }

        } else {
            result = "Invalid Number";
        }
        System.out.println(result);


    }
}


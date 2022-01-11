package day13_StringClass;

import java.util.Scanner;

public class FirsAndLast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any phrase or number:");//?
        String str1 = scan.nextLine();


        if (str1.charAt(0)==str1.charAt(str1.length() -1)){
            System.out.println("First and last characters are the same");
        }else{
            System.out.println("First and last characters are different");
        }
        scan.close();

    }

    }

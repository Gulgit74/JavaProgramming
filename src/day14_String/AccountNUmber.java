package day14_String;

import java.util.Scanner;

public class AccountNUmber {

    public static void main(String[] args) {




/* 6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”


    7. Create a class calledEmailTask1. */

        Scanner scan= new Scanner(System. in);

        System.out.println("Enter an account number");
        String accountnumber= scan.next();
        int num=accountnumber.length();
        String result = "";

        if (accountnumber.startsWith("2") && accountnumber.length()==7){
            result= "Account number is valid";



        }else if(accountnumber.startsWith("5") && accountnumber.length()==10){
            result= "Account number is valid";

        }else{
            result="Invalid account number";
        }
        System.out.println(result);

        scan.close();
    }
}
/*public class AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number ");
        String number = scan.nextLine();

        char accountNumber = number.charAt(0);

        if(accountNumber =='2' && number.length()==7){
            System.out.println("Account number is " + number);
        }else if(accountNumber =='5' && number.length()== 10){
            System.out.println("Account number is " + number);
        }else{
            System.out.println("Invalid account number");
        }
    }
}*/



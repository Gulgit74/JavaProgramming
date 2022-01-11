package day08_IfStatement;

public class NumberOfDays {

    public static void main(String[] args) {

/*3. Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
        int number = 5;
        boolean has28Gays = number == 2;
        boolean has30Days = number == 4 || number == 6  || number ==9 || number == 11;
        boolean has31Days = number

         int n = 5; // 1-7
        String day;

        if(n == 1) {
            System.out.println("Monday");
              day = "Monday";


  int  number = 10;
  boolean has31Days = number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number ==10||number == 12;
  boolean has28Days = number == 2;
  boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;

        System.out.println("number = " + number); */
        int n = 5;
        String days;

        if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
            System.out.println("31 days");
            days = "31 days";

        }
        else if(n == 4 || n == 6 || n == 9 || n ==11) {
            System.out.println("30 days");
            days = "30 days";
        }
        else{
        System.out.println("28 days");
        days = "28";
    }





    }
}

package day07_Operators;

/* 2. create a class named LeapYear, and write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true

        Hint: if the number of year can be evenly divisible by 4 (with remainder of zero), it's leap year
*/

public class LeapYear {

    public static void main(String[] args) {

        int year = 2020;
        boolean flag = false;
        if (year == 2020){

            System.out.println(year + " is leap year:  true");
        } else {
            System.out.println(flag);

            // Leapyear = year % 4 == 0;


        }


    }
}
/*int year = 2020;
boolean isLeapYear = year % 4 == 0;
System.out.println(year + " is leap year: " + isLeapYear);

 */
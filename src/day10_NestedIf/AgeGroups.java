package day10_NestedIf;

public class AgeGroups {

    public static void main(String[] args) {
/*
4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
*/
int AgeGroups = 60;
String result = "";

if( AgeGroups >=1 && AgeGroups <150) {
    if (AgeGroups < 21 && AgeGroups >= 1) {
        result = "Teenager";
    } else if (AgeGroups >= 21 && AgeGroups < 55) {
        result = "Adult";
    } else {
        result = "Senior";
    }

    System.out.println("result =" + result);
   }else{
        System.out.println("invalid");
    }






    }

}

package day23_CustomMetods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(10);

        ageOfPerson(1995);

        printNumbers(1000, 2000);
    }
        public static void oddOrEven ( int num){

            if (num % 2 == 0) {
                System.out.println(num +" "+ "is even number");

            } else {
                System.out.println(num + "is odd number");
            }
        }

        // create a function that can display the age of the person
        public static void ageOfPerson ( int birthYear){

            int age = 2021 - birthYear;

            System.out.println("Your age is: " + age);

        }

        //                                                       10       50
        //create a function that can print all the numbers between X and Y
        public static void printNumbers ( int x, int y){


        }

    }

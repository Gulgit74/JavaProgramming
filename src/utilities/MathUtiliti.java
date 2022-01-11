package utilities;

public class MathUtiliti {

    public static void main(String[] args) {
        int result = sumOfTwoNumber(5, 6);
        System.out.println(result);
        double result1 = subOfTwoNumber(5.5, 1.1);
        System.out.println(result1);
        double result2 = divideOfTwoNumber(12.2, 24.1);
        System.out.println(result2);
        String result3 = evenOfNumber(24);
        System.out.println(result3);

    }

    /*1. Create a class called MathUtility under the utilities package:

            2.1 Create a method that can return the sum of two integers
            2.2 Create a method that can return the sum of two decimal numbers

            2.3 Create a method that can return the subtraction of two integers
            2.4 Create a method that can return the subtraction of two decimals

            2.5 Creat a method that can return the multiplication of two integers
            2.6 Create a method that can return the multiplication of two decimals

            2.7 Create a method that passes two double parameters and return the division reslt

            2.8 Create a method that can check if an integer is even number
            2.9 Create a method that can check if an integer is odd number

            2.10 Create a method that can return the maximum number between two integers
            2.11 Create a method that can return the maximum number between two decimal numbers

            2.12 Create a method that can return the minimum number between two integers
            2.13 Create a method that can return the minimum number between two decimal numbers

            2.14 Create a method that can return the square of an integer
                    Ex: square(2) ==> 4
            2.15 Create a method that can return the square of a double

            2.16 Create a method that can return the cube of an integer
            2.17 Create a method that can return the cube of a double

     */
    public static int sumOfTwoNumber(int num1, int num2) {
        int result = num1 + num2;
        return result;


    }

    public static double sumOfTwoNumber(double num1, double num2) {
        double result = num1 + num2;
        return result;

    }

    public static int subOfTwoNumber(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static double subOfTwoNumber(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiplyOfTwoNumber(double num1, double num2) {
        double result = num1 * num2;
        return result;

    }

    public static int multiplyOfTwoNumber(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static double divideOfTwoNumber(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public static String evenOfNumber(int num1) {
        String result = " ";
        if (num1 % 2 == 0) {
            result = num1 + " is even number";

        }
        return result;
        /*public static int sum(int num1, int num2){
        return num1 + num2;
    }


    public static double sum(double num1, double num2){
        return num1 + num2;
    }


    public static int subtract(int num1, int num2){
        return  num1 - num2;
    }


    public static double subtract(double num1, double num2){
        return  num1 - num2;
    }


    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }


    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }


    public static double division(double num1, double num2){
        return  num1/ num2;
    }


    public static boolean isOdd(int num){
        return (num%2!=0)? true: false;
    }


    public static boolean isEven(int num){
        return (num%2==0)? true: false;
    }


    public static int max(int num1, int num2){
        return (num1>num2) ? num1 : num2;
    }


    public static double max(double num1, double num2){
        return (num1>num2) ? num1 : num2;
    }


    public static int min(int num1, int num2){
        return (num1<num2) ? num1 : num2;
    }


    public static double min(double num1, double num2){
        return (num1<num2) ? num1 : num2;
    }


    public static int square(int num){
        return num * num;
    }


    public static double square(double num){
        return num * num;
    }


    public static int cube(int num){
        return num * num * num;
    }


    public static double cube(double num){
        return num * num * num;
    }
    }
}
         */
    }
}




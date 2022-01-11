package day25_Overloading;

public class PalindromArray {
    /*
Task 6:
    1. Create a method that can reverse an integer array

    2. Create a method that can reverse a double array

    3. Create a method that can reverse a char array

    4. Create a method that can reverse a String array*/
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8};
        double[] arr2 = {2.2, 3.5, 12.4};
        System.out.println(reverse(arr2) + " ");
    }

    public static String reverse(int[] arr) {
        String reverse = " ";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse += arr[i] + " ";
        }


        return reverse;

    }

    public static String reverse(double[] arr) {
        String reverse = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse += arr[i] + " ";
        }

        return reverse;
    }

    public static String reverse(String[] arr) {
        String reverse = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse += arr[i];
        }

        return reverse;
    }

    public static String reverse(char[] arr) {
        String reverse = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse += arr[i];
        }

        return reverse;
    }
}
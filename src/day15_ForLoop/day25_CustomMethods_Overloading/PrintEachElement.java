package day15_ForLoop.day25_CustomMethods_Overloading;

/*public class ArraysUtility {
    public static void main(String[] args) {
   int num =0;
    }

//print integer of an array in separete lines
public static void printEach(int[] array) {
    for (int each : array) {

        System.out.println(each);
    }
}
    public static void printEach ( int[] array){
        for (int each : array) {
            System.out.println(each);*/


public class PrintEachElement {

    //prints each integer of an integer array in separate lines
    public static void printEach(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }


    //prints each double of double array in separate lines
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }


    //prints each char of char array in separate lines
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }


    //prints each String of String array in separate lines
    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }








}
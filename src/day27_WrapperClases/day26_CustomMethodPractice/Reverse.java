package day27_WrapperClases.day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = reverse(arr);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] reverse(int[] array) {
        int[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    public static double[] reverse(double[] array) {
        double[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

}
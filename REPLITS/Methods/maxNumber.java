package Methods;

import java.util.Scanner;

public class maxNumber {

    public static int findMax(int[] arr) {
        int maxNum = arr[0];
        for (int each : arr) {
            if (each > maxNum) {
                maxNum = each;
            }

        }
        return maxNum;
    }

    public static double findMax(double[] arr) {
        double maxNum = arr[0];
        for (double eachD : arr) {
            if (eachD > maxNum) {
                maxNum = eachD;
            }
        }
        return maxNum;
    }


    // DO NOT TOUCH THE MAIN METHOD

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if (runInt) {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }
    }
}








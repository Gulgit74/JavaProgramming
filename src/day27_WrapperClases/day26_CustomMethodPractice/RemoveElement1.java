package day27_WrapperClases.day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement1 {
    public static void main(String[] args) {
        int [] arr ={1,23,4,5,6,};
int[] arr2 = removeElement(arr,2);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[]removeElement(int[] arr, int index){
        if (index < 0 || index > arr.length) {

            System.out.println("Invalid index :"+ index);
            System.exit(0);

        }
        int[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if(i ==index){
                continue;

            } result = ArraysUtility.addElement(result, arr[i]);
        }
        return result;
    }
}

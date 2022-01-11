package day24Task;

import java.util.Arrays;

public class RemoveIndexOfElementFromArray {
    public static void main(String[] args) {
/*
int[] arr = {10,20,30,40,50,60};
int index =0;
        System.out.println(RemoveIndexOfElementFromArray(int[],int index));
    }
        /*
    }10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2
				removeElement(array, index) ==== {10, 20, 40, 50, 60}*/

     /*   public static int[] removeIndex(int[] arr, int index){
            int len = arr.length-1;
            int[] result = new int[len];
            int count=0;
            if (index>=0 && index<=len){
                for (int i = 0; i < arr.length; i++) {
                    if (index!=i){
                        result[count] = arr[i];
                        count++;
                    }
                }
            }
            return result;*/
        int[] array1 = {10, 20, 30, 40, 50, 60};
        int index = 2;

       int[]arr2 =removeElement(array1,index);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] removeElement(int a[], int index) {
        int newAr[] = new int[a.length - 1];
        int j = 0;
        for (int i = 0; i < a.length; i++) {

            if (i == index) {
                continue;
            }
            newAr[j] = a[i];
            j++;
        }

        return newAr;
    }
}




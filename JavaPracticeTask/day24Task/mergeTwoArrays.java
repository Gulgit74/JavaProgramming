package day24Task;

import java.util.Arrays;

//7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array
//This Question from sunday Task(DEC.12)
				//Ex:
					//arr1 = {1,2,3}
					//arr2 = {4,5,6}

					//merge(arr1, arr2) ====> {1,2,3,4,5,6}

public class mergeTwoArrays {

    // 5. create a method that can merge two arrays and return the new array
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,};
       int[] arr2 = {4,5};

       int[] arrs = mergeTwoArrays(arr1,arr2);
        System.out.println(Arrays.toString(arrs));
    }


    public static int[] mergeTwoArrays(int[]arr1, int[]arr2){
        int count =0;
        int[]arr3 = new int[arr1.length+ arr2.length];
        for(int element :arr1){
       arr3[count]= element;
       count++;
        }
        for(int i : arr2){
            arr3[count]=i;
            count++;
        }
        return arr3;
    }

}

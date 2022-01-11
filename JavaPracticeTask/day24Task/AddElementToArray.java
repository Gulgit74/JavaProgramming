package day24Task;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {

        int[] Arr = {2, 3, 4, 5};
        int num = 0;
        int[]arr2 = addElementToArray(Arr,num);
        System.out.println(Arrays.toString(arr2));
        //System.out.println(AddElementToArray(int[] Arr, int num));
     /*    6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}*/
    }
        public static int[] addElementToArray(int[] Arr,int num){
            int[] newArr=new int[Arr.length+1];
            int count=0;
            for (int each : Arr) {
                newArr[count]=each;
                count++;
            }
            newArr[count]=num;
            return newArr;
        }

    }


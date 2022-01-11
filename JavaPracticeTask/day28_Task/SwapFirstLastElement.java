package day28_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapFirstLastElement {
    /*2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(swap(list, 0, list.size() - 1));

      /*  list.add(3);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);
*/
    }
    public static ArrayList<Integer> swap(ArrayList<Integer> arr, int a,int b){
        int temp = arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,temp);
        return arr;

    }
}
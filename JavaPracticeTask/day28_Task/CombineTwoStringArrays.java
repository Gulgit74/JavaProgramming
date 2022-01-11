package day28_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoStringArrays {
    /* 4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
*/
    public static void main(String[] args) {
       // arr1 = {A", "B", "\"C"};
       // arr2 = {"D", "E", "F", "G"};
        ArrayList<String> arr1 =new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("D", "E", "F", "G"));
        arr1.addAll(arr2);
        System.out.println(arr1);


}
    }
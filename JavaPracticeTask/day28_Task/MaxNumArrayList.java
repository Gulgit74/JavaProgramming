package day28_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumArrayList {
    /*5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5*/
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

              list.add(1);
              int max = 0;
        for (Integer each : list){
            if(each > max){
                max =each;
            }
            System.out.println("max =" +max);
        }
        
        
        
    }
    
    
}

package day20_ArraysIntro_Assigments;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

       /*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

*/

int[] num = {1,2,3,4,5};
int [] reversedNum = new int[num.length];

for(int i =0; i<num.length; i++){
    reversedNum[i] = num[num.length-1 -i];

}

        System.out.println(Arrays.toString(reversedNum));


    }
}

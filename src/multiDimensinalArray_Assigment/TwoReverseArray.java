package multiDimensinalArray_Assigment;

import java.util.Arrays;

public class TwoReverseArray {
    public static void main(String[] args) {
        /*1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
*/

       int[][] array = {{1, 2, 3}, {4, 5, 6}};

        int[][] reverse = new int[array.length][array[0].length];

        for (int i = 0, a = array.length - 1; i < array.length; i++ , a--) {

            for (int j = 0, b = array[i].length - 1; j < array[i].length; j++, b--) {
                reverse[i][j] = array[a][b];

            }
        }
        System.out.println(Arrays.deepToString(reverse));
    }
}

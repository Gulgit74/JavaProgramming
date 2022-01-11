package multiDimensinalArray_Assigment;

public class LunchDec7 {
    public static void main(String[] args) {

     /*   1. Write a program that can find the minimum and maximum numbers from a two dimensional array

        2. Write a program that can count the total odd and even numbers from a two dimensional array

        3. Given the array:
        int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };
        Use for each loop to print each elements
      */
        int[][] numbers = {{2, 4, 8, 10, 12, 14, 28}, {1, 5, 7}};
        int countOdd = 0;
        int countEven = 0;

        for (int[] each : numbers) {
            for (int i : each) {
                if (i % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;

                }
            }
        }
        System.out.println("countEven =" + countEven);
        System.out.println("countOdd =" + countOdd);

        System.out.println("-------------");
        int[][][][][][][][] arr8D = {{{{{{{{1, 2, 3, 4, 5}}}}}}}};
        for (int[][][][][][][] each7D : arr8D) {
            for (int[][][][][][] each6D : each7D) {
                for (int[][][][][] each5D : each6D) {
                    for (int[][][][] each4D : each5D) {
                        for (int[][][] each3D : each4D) {
                            for (int[][] each2D : each3D) {
                                for (int[]each1D: each2D){
                                    for (int each : each1D) {
                                        System.out.println(each+" ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

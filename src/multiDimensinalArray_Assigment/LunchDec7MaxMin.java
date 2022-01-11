package multiDimensinalArray_Assigment;

public class LunchDec7MaxMin {

    public static void main(String[] args) {

/*  1. Write a program that can find the minimum and maximum numbers from a two dimensional array */

        int[][] numbers = {{1, 2, 3, 4, 6}, {10, 9, 8}, {7, 9, 10}};
            int min = numbers[0][0];
            int max = numbers[0][0];

            for(int[] number : numbers){
                for(int i :number){
                    if(i<min){
                        min = i;
                    }
                    if(i >max){
                        max = i;
                    }

                }
            }
        System.out.println("max = "+ max);
        System.out.println("min = " + min);
    }
}

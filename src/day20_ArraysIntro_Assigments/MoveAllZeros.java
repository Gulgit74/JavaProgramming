package day20_ArraysIntro_Assigments;

import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args) {

    /*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0}

            output:
                 {10, 5, 1, 0, 0, 0}

*/

        int[] array = {10, 0, 5, 0, 1, 0};
        int result[ ] = new int[array.length];
        //int count = 0;
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i] != 0){
                result[j++] = array[i];

            }

        }
        System.out.println(Arrays.toString(result));
      /*  int[] newOrder = new int[array.length];//?
        int a = 0;
        int b = array.length - 1;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {

                newOrder[b] = array[i];
                b--;
            } else {
                newOrder[a] = array[i];
                a++;
                //System.out.println(newOrder);
            }
            System.out.println(newOrder);
        }
        //System.out.println(newOrder);*/

    }

}
/*   int newArr[]=new int[arr.length];
        int j = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                newArr[j] = arr[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(newArr));
    }
}*/
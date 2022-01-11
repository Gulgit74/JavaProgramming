package day20_ArraysIntro;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

      /*  char[] letters = new char[26];

        System.out.println(Arrays.toString(letters));
        //  letters[0] = 'A';


        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            // i index numbers 0~ last index
            // letters i= (char)j;
            //  letters[i] = ch;
            System.out.println("---------------");


        }
*/
        char[] letters = new char[26];
         letters[0 ] = 'Z';
        System.out.println(Arrays.toString(letters));

        for (char i = 'Z' , j = 0; j<=letters.length- 1 && i >= 'A'; i--, j++) {
        // letters i = (char) j;

            //System.out.println(Arrays.toString(letters));

        }
    }
}
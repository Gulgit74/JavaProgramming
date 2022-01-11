package day21_ForEachLoop;

import java.util.Arrays;

public class sortArrays {
    public static void main(String[] args) {

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmat", "Maria", "Sinem"};

        Arrays.sort(names);// ascending orders are 0~9, a~z ,A~ Z smallest to largest. Upper case starting from(65) and lowercase (97)den baslar aski tablde. o yuzden aynyi karakter icin uppercase once gelir.


        System.out.println(Arrays.toString(names));

        System.out.println("----------------------");
        int[]arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean  r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);
        boolean r2 = Arrays.equals(arr1,arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(r2);
        System.out.println("--------------------");

char []ch1 ={'a', 'c', 'b'};
char[]ch2 ={'b', 'a', 'c'};

Arrays.sort(ch1);
Arrays.sort(ch2);

      //  System.out.println("anagram=" + anagram);
        System.out.println("-----------------");

int[] scores = {10, 20, 30, 40, 50,60, 70, 80,90,100};
//index             0      1  2    3    4   5    6      7   8   9

      //  int[] result = Arrays.copyOfRange(scores, 3,);


    }
}

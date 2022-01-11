package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdbe";
        String str2 ="dbcaz";



        char[]ch1 = str1.toCharArray();
        char[]ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);

        System.out.println("---------------");

        String email = "WoodenSpoon@cydeo.com";
        String [] arr = email.split("@");
       // String[] arr = email.println(Arrays.toString(arr));


        System.out.println("--------------------------");
String s = "Today is a nice day. Today is Monday. Today we learn Java";


String[] sentence = s.split("\\.");

        System.out.println(Arrays.toString(sentence));



    }
}

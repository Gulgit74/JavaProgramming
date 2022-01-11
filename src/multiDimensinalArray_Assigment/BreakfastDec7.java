package multiDimensinalArray_Assigment;

import java.util.Arrays;

public class BreakfastDec7 {
    public static void main(String[] args) {
/*
        1. Write a program that can reverse a sentence
        Ex:
        sentence = "Today is a good day to learn Java";

        output:
        Java learn to day good a is Today

        2. Write a program that can reverse the second word of the sentence
        Ex:
        sentence = "I Love Java";

        output:
        I evoL Java*/
        /* String [] words = sentence.split(" ");// [I, Love, Java]

        String reverse = " ";

        for(int i=words[1].length()-1; i>=0; i-- ){
            reverse +=words[1].charAt(i);
              */

       /* String sentence = "Today is a good day to learn Java";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }
            System.out.println(reverse);
        System.out.println("--------------------------");*/

        String sentences = "I Love Java";
        String [] word = sentences.split(" ");
        String reverse = "";
        //System.out.println(Arrays.toString(word));

        for (int i = word[1].length()-1;i>=0; i--) {
            reverse += word[1].charAt(i);
        }
            System.out.println(reverse);
        word[1] =reverse;
        System.out.println(Arrays.toString(word));
        }
        }



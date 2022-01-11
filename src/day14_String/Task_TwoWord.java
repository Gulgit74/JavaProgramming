package day14_String;

//import java.util.Scanner;

public class Task_TwoWord {
/* 1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana*/
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        String w1 = "Table";
        String w2 = "Chair";
        String s1 = w1.substring(1,5);
        String s2 = w2.substring(1,5);
        System.out.println(s1 + s2);
           // String word = scan.next();

            //word = word.replace("c", "");

           // System.out.println(word);

        // scan.close();
        }
    }








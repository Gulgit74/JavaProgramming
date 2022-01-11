package day01_Dec1;

import java.util.Scanner;

public class LoopIsEmpty {
    public static void main(String[] args) {
        /*
        Input: "Hello" -> "He"
        Input :"abcdef" -> "ab"
        Input : "a" ->         "a"
        Input : " "    ->  It cannot be empty
       */
        Scanner   input = new Scanner (System.in);
        System.out.println("Please enter word");
        String word = input.nextLine();

        if(word.isEmpty()){
            System.out.println("It cannot be empty");
        }else if(word.length()<=2){
            System.out.println(word);
        }else{
            System.out.println(word.charAt(0)+" "+word.charAt(1));
            System.out.println(word.substring(0,2));
        }


    }
}

package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {

    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();// only one time use

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x", "a");
            System.out.println(word);
        }
        //System.out.println(word);
    }
}


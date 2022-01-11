package day16_ForLoopStringPractice;


import java.util.Scanner;

public class Replit_One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String word = scan.next();
        //char w = ' ';
        //WRITE YOUR CODE HERE:
       // System.out.println(char word1+ char word2);
char word1 = scan.next().charAt(0);
char word2 = scan.next().charAt(scan.next().length() -1);
scan.close();
    }
}



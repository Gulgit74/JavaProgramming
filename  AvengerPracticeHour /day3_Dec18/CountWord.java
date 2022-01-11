package day3_Dec18;

public class CountWord {
    public static void main(String[] args) {
     // Write the Question 2.
        //                                Count the word that is given inside the sentence
        //                                input: Java is Java
        //                                word:Java
        //                                output:2

String sentence ="Java is Java";
String word = "Java";
int count = 0;
    //8  //12-4=8
        for (int i = 0; i <sentence.length()-3 ; i++) {
          String temp = sentence.substring(i,i +word.length());
          if(temp.equals(word))
              count++;
          }
        System.out.println("count ="+ count);
        }
    }


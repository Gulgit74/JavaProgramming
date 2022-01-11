package day3_Dec18;

public class CountWord2 {
    public static void main(String[] args) {

        // Write the Question 2.
        //                                Count the word that is given inside the sentence
        //                                input: Java is Java
        //                                word:Java
        //                                output:2
       String sentence = "Java is Java";
       String word = "Java";
       int count = 0;

       while(sentence.contains(word)){
           count++;

           sentence =sentence.replaceFirst(word,"");

       }
        System.out.println("count =" + count);
    }
}

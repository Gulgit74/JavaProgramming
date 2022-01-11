package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfJava {

    public static void main(String[] args) {
        /*4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
*/
        Scanner scan = new Scanner(System.in);

        System.out.println("enter  sentence: ");
        String str = scan.nextLine().toUpperCase();

        System.out.println("Enter a word:");
        String word = scan.next();
        int frequency = 0;

        for (int i = 0; i < str.length() -word.length(); i++) {
            if (str.substring(i, i + word.length()).equalsIgnoreCase(word)) {
                frequency++;
            }
        }

        System.out.println(frequency);
scan.close();

        System.out.println("-------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat";
    int countCat = 0;

    while(sentence.contains("cat")){
        sentence = sentence.replaceFirst("cat"," ");
        countCat++;
    }

        System.out.println(countCat);
        System.out.println("----------------------------");
        String s = "java java java python python python";

        int countJava =0;
        int countPython =0;
        while(s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s = s.replaceFirst("java", " ");
                countJava++;

            }
           if(s.contains("python")){
               s = s.replaceFirst("python", "");
               countPython++;
           }
        }
        System.out.println("countJava =" + countJava);
        System.out.println("countPython =" + countPython);
    }
}

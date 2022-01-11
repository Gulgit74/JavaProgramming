package day4_UnitTest2Solution_Dec22;

import java.util.Arrays;

public class Unit2FoorLoopConyinue {
    public static void main(String[] args) {

        String resultContinue = " ";
        String resultAfterContinue = " ";

        for (int i = 0; i < 10; i++) {
           // int count = 1;
            if (i % 2 == 0) {
            resultContinue += i +" ";
                continue;

            } else{
               // System.out.println(i);
                resultAfterContinue += i + " ";
            }
        }
        System.out.println("resultContinue =" + resultContinue);
        System.out.println("resultAfterContinue =" + resultAfterContinue);
    }

    public static class MultipleWords {

            /*
        Task :  Write a program that accepts string and prints multiple words in the string
            "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
            output : wooden spoons
                     trash can
                     dish washer
             */

        public static void main(String[] args) {

            String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

            String [] splitArr= words.split(", ");

            System.out.println(Arrays.toString(splitArr));

            for (String eachWord: splitArr) {
                if(eachWord.contains(" ")){
                    System.out.println(eachWord);
                }

            }

        }
    }
}
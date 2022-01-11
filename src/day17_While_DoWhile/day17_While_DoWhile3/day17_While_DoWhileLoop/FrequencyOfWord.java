package day17_While_DoWhile.day17_While_DoWhile3.day17_While_DoWhileLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String  str = "JavaJavaJavaJavaJava";


        int frequency = 0;
//                              8 - 4
        for (int i = 0; i <= str.length()-4; i++) {
            String eachSub =    str.substring(i, i+4 );
            //System.out.println(eachSub);

            if(eachSub.equals("Java")){
                frequency++;
            }

        }

        System.out.println(frequency);
        System.out.println("-------------------");

        String  str1 = "Cat Cat Dog Dog cAt CAT caT";

        int frequency1 = 0;

        for (int i = 0; i <= str1.length()-3; i++) {
            String eachSub =    str1.substring(i, i+3 );

            if(eachSub.equalsIgnoreCase("Cat")){
                frequency1++;
            }

        }

        System.out.println(frequency);

    }
}




/*
2. write a program that can return the frequency of the word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3
           	Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */



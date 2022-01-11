package day19_NestedLoop1;

import java.util.Scanner;

public class DuplicatedCharacter {

    public static void main(String[] args) {

     /*Tasks:
    1. Write a program that can return the first duplicated character from a string
    2. Write a program that cna return the index number of the first duplicated character from a string
    3. Write a program that can display all the characters that appeared twice in the string.
    4. Write a program that can return the index number of the first unique character.
*/
 /*       Scanner scan = new Scanner(System.in);
        String str = scan.next(); // System.out.println("Enter any string")
        String result = " ";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }

            }
            if (count > 1) {
                result += ch;

            }
        }
            System.out.println(result.charAt(0));

*/
        String s = "ajfhhyy";
        String newWord2 = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    newWord2 = s.charAt(i) + "";

                }
            }
            if (count == 2) {
                break;
            }
        }

        System.out.println("first duplicate is: " +newWord2);

        System.out.println("-----------------------");



    String str = "ajfrghyy";
    String newWord = "";
        for (int i = 0; i < s.length(); i++) {
        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(j)) {
                count++;
                newWord2 = s.charAt(i) + "";

            }
        }
        if (count == 2) {
            break;
        }
    }

            System.out.println("first duplicate is: " +newWord);
        System.out.println("index of first duplicate character: "+s.indexOf(newWord2));



    }
}

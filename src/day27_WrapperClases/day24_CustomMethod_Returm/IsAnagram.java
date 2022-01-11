package day27_WrapperClases.day24_CustomMethod_Returm;

import java.util.Arrays;

public class IsAnagram {
/*
    public class isAnagram {
        public static void main(String[] args) {

        }
        public static boolean isAnagram(String str1, String str2){
            char[] ch1 =str1.toCharArray();
            char[] ch2 =str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1, ch2);
        }


    }
/*
 2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";
    				isAnagram(str1, str2) ====> true
 */
public static void anagram(String str1, String str2){
    char[] ch1 = str1.toCharArray();
    char[] ch2 = str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);

    if(Arrays.equals(ch1, ch2)){
        System.out.println("Anagram");
    }else{
        System.out.println("Not anagram");
    }

}


}
/*
    16. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")
			output:
				silent and listen are anagram

 */

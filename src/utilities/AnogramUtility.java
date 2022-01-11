package utilities;

import java.util.Arrays;

public class AnogramUtility {
    public static void main(String[] args) {
        //String[] str ={"java","lenguage"};
    }

    public static boolean Anagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
        //System.out.println("----------------");
     /*   public static String removeDuplicates(String str){
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (!result.contains("" + each)) {
                    result += each;
                }

            }

            return result;
        }
*/

       /* public static String removeDuplicates(String str){

            String result = "";

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if(!result.contains(""+each)){
                    result += each;
                }

            }

            return result;
        }
*/

    }
    }

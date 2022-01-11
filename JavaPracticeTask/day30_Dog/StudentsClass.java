package day30_Dog;

public class StudentsClass {

    public static void main(String[] args) {
        String one = "Java";
        String two = "Selenium";
        System.out.println(mergeString(one, two));
    }

    /*
     * Write a method mergeStrings that will return the strings merged,
     * one letter at a time, starting with one.
     * Please note one and two can be of different lengths.
     *
     * Examples:
     *
     * s1 ==> "12345"=>for each
     * s2 ==> "abcde"=>for each
     * mergeStrings(s1,s2) ==> "1a2b3c4d5e"
     * s1 ==> "12345"
     * s2 ==> "abcde"
     * mergeStrings(s1,s2) ==> "1a2b3c4d5e"
     * mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
     *
     * mergeStrings("java", "selenium") ==> "jsaevlaenium"

     */
    public static String mergeString(String one, String two) {

        String combined = "";


        int shorterlength = one.length() < two.length() ? one.length() : two.length();

        for (int i = 0; i < shorterlength; i++) {
            combined += "" + one.charAt(i) + two.charAt(i);

        }
        if (one.length() > two.length()) {
            combined += two.substring(shorterlength);

        } else {
            combined += two.substring(shorterlength);
        }
        return combined;
    }
}
package day27_WrapperClases.day24_CustomMethod_Returm;

public class PalindromReverseReturnMethodIntro {


    public static void main(String[] args) {
        String str = "Java";
        String result = reverse(str);
        System.out.println(result);

        if (str.equalsIgnoreCase(result)) {
            System.out.println(str + " is palindrome");

        } else {
            System.out.println(str + " is not palindrom");
        }
    }

    public static String reverse(String str) {
        String reverse = " ";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
        //System.out.println(reverse);
    }
}
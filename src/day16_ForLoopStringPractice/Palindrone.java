package day16_ForLoopStringPractice;

public class Palindrone {

    public static void main(String[] args) {
//"Anna" "annA" ====> polindrone word

        String word = "Level";
        String reversed = "";

        for(int i = word.length()-1; i >= 0 ; i--){
            reversed += word.charAt(i);
        }
        boolean isPalindrone = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrone = " + isPalindrone);





    }
}

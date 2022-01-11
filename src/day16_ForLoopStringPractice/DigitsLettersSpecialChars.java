package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = " Cydeo12345School!@#$%WoodenSpoon";

        String digits = " "; // 12345
        String letters = " "; // CydeoWoodenSpoon
        String specialCharacters = " ";    // @#$%

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            //System.out.println(ch);
            if (ch >= '0' && ch <= '9') {
                digits += ch;

            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;

            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                if (ch != ' ') {  // if the special characters not space
                    specialCharacters += ch;


                }
            }

            }


            System.out.println("digits =" + digits);
            System.out.println("letters =" + letters);
            System.out.println("specialCharacters =" + specialCharacters);


        }
    }

package day3_Dec18;

public class WringTillWord2 {

    public static void main(String[] args) {
/*
        *Given a non-empty string like "Code" print a string like below output.
        (do with substring  first)
        Code → "CCoCodCode"
        abc → "aababc"
        ab → "aab"
        (do with charAt())
        Code → "C-Co-Cod-Code"
        abc → "a-ab-abc"
        ab → "a-ab"*/

        /*  * (do with charAt())
         *                            Code → "C-Co-Cod-Code"
         *                            abc → "a-ab-abc"
         *                            ab → "a-ab"
         */
       // String word = "Code";
       /* String c =""+ word.charAt(0);//C
//String co= word.charAt(0)+word.charAt(1)+ "";//This is wrong because "" + shoud be at the begginin of line.Eski code
        String co= ""+ word.charAt(0)+word.charAt(1);//Co
        //System.out.println("co="+co);
        String cod= ""+ word.charAt(0)+word.charAt(1)+ word.substring(2);//Cod
        String code= ""+ word.charAt(0)+word.charAt(1)+ word.substring(2)+word.substring(3);//Code

        String temp ="";
        for (int i = 0; i <word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                temp =""+ word.charAt(j);
            }
            temp+="-";
        }
        temp = temp.substring(0, temp.length()-1);
        System.out.println("temp ="+ temp);*/
            String word = "Code";
            String c = word.charAt(0) + "";//C
            String co = "" + word.charAt(0) + word.charAt(1);//Co
            String cod = "" + word.charAt(0) + word.charAt(1) + word.charAt(2);//Cod
            String code = "" + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3);//Code

            String temp = "";
            for (int i = 0; i < word.length(); i++) {

                for (int j = 0; j <= i; j++) {
                    temp += "" + word.charAt(j);
                }
                temp += "-";
            }
            temp = temp.substring(0, temp.length() - 1);
            System.out.println("temp = " + temp);

        }
    }


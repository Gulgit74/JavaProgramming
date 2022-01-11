package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "cLdeo1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countspecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigit++;
        }else{
                countspecialChar++;
            }

    }
        System.out.println("countLowerCase = " +countLowerCase);
        System.out.println("countUpperCase = "+ countUpperCase);
        System.out.println("countSpecialChar = " + countspecialChar);
        System.out.println("countDigit = " + countDigit);

        boolean hasUpperCase = countUpperCase >0;
        boolean hasLowercase = countLowerCase >0;
        boolean hasSpecialChar = countspecialChar >0 ;
        boolean hasDigit = countDigit >0;

       // boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasSpecialChar && hasLowercase && hasUpperCase && hasDigit;

       // System.out.println("strongPassword = " + strongPassword);
        boolean strongPassword =false;

        if(password.length() >= 8){
            if(!password.contains(" ")){
                if(hasUpperCase){
                    if(hasLowercase){
                        if(hasDigit){
                            if(hasSpecialChar){
                                strongPassword = true;
                            }
                        }
                    }
                }
            }
        }


        System.out.println("strongPassword = " + strongPassword);

    }
    }
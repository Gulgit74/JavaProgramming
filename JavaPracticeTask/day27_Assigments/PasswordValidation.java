package day27_Assigments;

public class PasswordValidation {
    public static void main(String[] args) {
        String password="Aclkcabduh!666e";
        boolean isValid=false;
        if(password.length()>8 && !password.contains(" ")) {

            for (char each : password.toCharArray()) {
                if (Character.isDigit(each) && Character.isLowerCase(each) && Character.isUpperCase(each) &&
                        !Character.isLetterOrDigit(each)) {
                    isValid = true;
                }
            }
        }
        System.out.println(isValid);
    }
}

package day35_Task;

public class Credentials {
    /* create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)


     */
    private String username, password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
        setPassword(password);
    }
    public boolean isStrong(String password){
        boolean a=password.length()>=8;
        boolean b=!password.contains(" ");
        int digitCount=0;
        int letterCount=0;
        int specialCount=0;
        for (int i = 0; i <password.length() ; i++) {
            if(Character.isDigit(password.charAt(i))){
                digitCount++;
            }
            else if(Character.isLetter(password.charAt(i))){
                letterCount++;
            }
            else if(!Character.isLetterOrDigit(password.charAt(i))){
                specialCount++;
            }
        }
        boolean result=a && b && specialCount>=1 && digitCount>=1 && letterCount>=1;
        return result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrong(password))return;
        this.password = password;
    }


    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}




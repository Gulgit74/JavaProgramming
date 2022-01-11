package day17_While_DoWhile;

public class browserName {

    public static void main(String[] args) {
/*
        1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
        String browser = "chrome";

        Output:
        Chrome Browser is selected

        Note: MUST use nested if

        2. Write a program that can convert numbers 0~9 to words.

        NOTE: MUST use ternary
    */
        String browserName = "chrome";
        String result = ""; //temporary data, browser should be valid
        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge";

        if (validBrowser) {
            if (browserName == "chrome") {
                result = "Chrome is selected";
            } else if (browserName == "firefox") {
                result = "Firefox is selected";
            } else if (browserName =="opera") {
                result = "Opera is selected";
            } else if (browserName == "safari") {
                result = "Safari is selected";
            } else {
                result = "edge";
            }
        } else{

        result = "invalid Browser";

             System.out.println(browserName);
    }

}


    }

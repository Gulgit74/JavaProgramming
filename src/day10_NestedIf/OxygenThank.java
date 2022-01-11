package day10_NestedIf;

public class OxygenThank {

    public static void main(String[] args) {

      /*4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you  at 50%

                USE ONE PRINT STATEMENT ONLY
*/
        int OxygenLevel = 75;
        String result = "";
        if (OxygenLevel > 50 && OxygenLevel < 100) {
            if (OxygenLevel > 50 && OxygenLevel <= 60) {
                result = "Be careful now you at 50 %";
            } else if (OxygenLevel > 60 && OxygenLevel <= 70) {
                result = "Start to head back";
            } else if (OxygenLevel > 70 && OxygenLevel <= 80) {
                result = "Don't go too far";
            } else if (OxygenLevel > 80 && OxygenLevel <= 90) {
                result = "Still okay";
            } else {
                result = "Your thank is full";
            }
            System.out.println(result);
        }
    }
}
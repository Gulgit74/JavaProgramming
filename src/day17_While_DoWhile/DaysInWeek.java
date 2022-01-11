package day17_While_DoWhile;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 5;
        switch (number) { // 1,2,3,4,5,6,7  use only "==" , always uniqe variable for each case

            case 1:
                System.out.println("Monday");
                break;
            case 2: // Exit the switch after executing the case block
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");// if no Break statement its goes to the next block
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;


        }
    }
}
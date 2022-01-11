package day08_IfStatement;

public class SingleIfStatementIntro{

    public static void main(String[] args) {


        int number = 300;
        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;

        if (evenNumber) {
            System.out.println(number + " is even number");
        } else {

            System.out.println(number + "is odd number");
        }


    }



    }

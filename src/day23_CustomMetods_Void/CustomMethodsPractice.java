package day23_CustomMetods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

/*
        helloWorld5Times();

        System.out.println("------------------------------");

        helloCydeo5Times();

        System.out.println("--------------------");

        evenNumbers();
*/
    }


    // create a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Word");
            //  @@ -21,6 +25,24 @@ public static void helloWorld5Times(){

        }
    }


    // create a function that can print all the even numbers from 1 ~ 10 ==> evenNumbers

    public static void evenNumbers() {
        for (int i = 2; i < 11; i += 2) {
            System.out.println(i);
        }

    }



      /* 6  src/day23_CustomMethods_Void/day23 class notes.txt
        @@ -91,6 +91,12 @@ Method: Function



        Custom Methods:
        1. void methods
        2. void methods with argumnets
        3. return methods
        4. returns with argumnet
        5. overloading

    }
       */
}
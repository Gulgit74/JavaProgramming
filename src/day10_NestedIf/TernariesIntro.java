package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;
        if( n%2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        System.out.println("----------------------");

       String result1 = (n%2 == 0)? "Even"  : "Odd";

        System.out.println(result1);
        System.out.println("-------------------------");
        /*
        int age = 23;
        if(age >= 21) {
            System.out.println("Eligible");
        }else{
            System.out.println("Eligible");
        }

         */
        int age = 17;
        String result2 =  (age >= 21) ?  "Eligible" : "Not eligible" ;
        System.out.println(result2);
    }

}


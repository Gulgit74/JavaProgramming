package day10_NestedIf;

public class CrewAndPassengers {

    public static void main(String[] args) {


       int total = 200;
       String result = "";

       if (total==50 || total ==75 || total ==100) {
           if (total == 50) {
               result = "20 crew, 30 passenger";
           } else if (total == 75) {
               result = "25 crew, 50 passenger";
           } else {                                                // 100
               result = "30 crew, 70 passenger";
           }
       }else{
           result = "not valid";
       }

        System.out.println(result);



    }
}












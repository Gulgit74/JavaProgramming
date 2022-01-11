package day06_PrimitiveTypeCastings;

public class Birthday {
    public static void main(String[] args) {



    /*1. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.

     */


        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;
        String birthJohn = (name + " " + "was born on" + " " +  birthMonth + "/" + birthDay + "/" + birthYear +  ".");

        System.out.println(birthJohn);


    }
}
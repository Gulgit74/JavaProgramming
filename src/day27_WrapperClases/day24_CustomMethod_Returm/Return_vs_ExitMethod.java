package day27_WrapperClases.day24_CustomMethod_Returm;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {
       nameOfDay(6);
      //int number = 0;
    }
    public static void nameOfDay(int number){

    if(number< 1|| number>7){

      System.out.println("Invalid");

        return; //exits nameOfDay method

    }
       String name = (number ==1)?"Monday" :(number ==2)? "Tuesday" : (number == 3)? "Wednesday" :(number ==4)? "Thurday" :(number == 5)? "Friday": ( number == 6)? "Saturday":"Sunday";


        System.out.println("Day name = " + name);






    }
}
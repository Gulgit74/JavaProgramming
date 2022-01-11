package day4_UnitTest2Solution_Dec22;

public class whileLoop {
    public static void main(String[] args) {
        int number =5;
        while(number <100){

            number += number; // number = number+number;// number = 5+5=10;10+10=20,20+20=40,....
        }
        System.out.println(number);
    }
}

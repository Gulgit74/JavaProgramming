package day21_ForEachLoop.day32_Constructors;

public class CarOblects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Accord");
        Car car3  = new Car("Lexus", "RX350", 2021);
        Car car4 = new Car("Tesla", "YS130", 2022);
        Car car5 = new Car("Mercedes", "X6", 2017,123000,"Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }


}

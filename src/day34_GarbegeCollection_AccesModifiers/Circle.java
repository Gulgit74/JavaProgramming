package day34_GarbegeCollection_AccesModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name = "Circle";

    public static ArrayList<Integer> numbers;

    //public Circle Sheet sheet;
    public Circle(double radius) {
        this.radius = radius;
        // pi =3.14;
    }

    static {//if static take more than one step static block is better
        //radius = 5 cannot write here the instances. We can use out side of the class also
        pi = 3.14;
        name = "Circle";


        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    }

/*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
       // numers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi="+pi);
        System.out.println("name="+name);


    }
 */
}
package day17_While_DoWhile;

import java.util.Scanner; // regular import :import one class   " * " use for import everything from the package-wild import

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double r = scan.nextDouble();

        double area = r * r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("area =" + area);
        System.out.println("perimeter =" + perimeter);

        scan.close();
    }
}

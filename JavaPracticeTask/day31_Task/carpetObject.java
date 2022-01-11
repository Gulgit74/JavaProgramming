package day31_Task;

public class carpetObject {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(6, 10, 125.5, true);
        Carpet carpet2 = new Carpet(8, 5, 125.5, false);
        System.out.println(carpet1);
        System.out.println(carpet2);

        System.out.println(carpet1.calcCost());
        System.out.println(carpet2.calcCost());

    }


}

package day27_WrapperClases.day24_CustomMethod_Returm;

public class MinNumbersArray {

    public static void main(String[] args) {
        int minNumber = min(12, 50);
        System.out.println(minNumber);
    }

    public static int min(int a, int b) {

        int result = 0;

        if (a < b) {
            result = a;

        } else {
            result = b;
        }
        return result;
    }
}




package day3_Dec18;

public class SwapTwoNumWithoutThirdVariable {
    public static void main(String[] args) {
      int a =10;
      int b =15;

        System.out.println("a="+a);
        System.out.println("b="+b);

        a= a+b;//25
        b=a-b;//25-10=15
        a= a-b;//25-15=10

        System.out.println("a="+a);
        System.out.println("b="+b);




        //int a=15;
     // int b=10;

      //no third variable,no temp!

    }
}

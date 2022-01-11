package Day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

       int n1 = 100;
        int n2 = 200;

        boolean n1Is1Min = n1< n2;
        boolean n2IsMin = n2 < n1;
        boolean Equal = n1 == n2;
        if(n1Is1Min){
            System.out.println(n1Is1Min + "is Minimum number");
        }
        else if(n2IsMin){
            System.out.println(n2IsMin + "is Minimum number");

        }
        else {
     System.out.println(n1 + "is equal " + n2);

            }







    }



}


package Day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 20,
                c = 30;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        System.out.println();
/* in order for a to be median number:
        1. if c is the max number & b is the minimum number,then a is the median number.
         2. if b is the max number & c is min number ,then a is the median number;


 */





      // If(bIsMedian){
    // }


       //I f(cIsMedian){







    }
}

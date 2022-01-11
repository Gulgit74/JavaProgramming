import java.util.ArrayList;
import java.util.Arrays;

public class MinNumArrays {
    /*6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1*/
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int min =99;

        for (int each:list){
            if(each < min){
                min = each;
            }
           // System.out.println(min);
        }

        System.out.println(min);

    }
}

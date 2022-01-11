package unitAssesment3_Stady;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

    public static void main(String[] args) {


        ArrayList<Integer> ints =new ArrayList<>();

        ints.addAll(Arrays.asList(1,2,3,4,5,6,7));
        int a=5;
        Integer b =5;
        System.out.println(ints.remove(b));
        System.out.println((ints.remove(a)));
    }
}

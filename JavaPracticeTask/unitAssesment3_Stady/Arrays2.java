package unitAssesment3_Stady;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list);
    }
}



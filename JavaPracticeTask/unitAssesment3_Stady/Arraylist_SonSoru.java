package unitAssesment3_Stady;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_SonSoru {


    public static void main(String[] args) {


        String[] cities = {"Boston", "Houston", "Austin", "Lincoln", "Tulsa"};

        // { "Boston", "Houston", "Austin", "Lincoln", "notsoB"}  , list.set(4,rev)
        //{ "Boston", "Houston", "Austin", "notsuoH", "notsoB"}   , list.set(3,rev)
        //{ "Boston", "Houston", "nituA", "notsuoH", "notsoB"},  list.set(2,rev)
        //{ "Boston", "Houston", "nituA", "notsuoH", "notsoB"} , list.(1,rev)
        //{ "Boston", "Houston", "nituA", "notsuoH", "notsoB"} ,list.(0,rev)

        ArrayList<String> list = new ArrayList(Arrays.asList(cities));
        int a = list.size();

        for (String str : list) {
            String rev = "";


            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);

                list.set(--a, rev);


                System.out.print(list);
            }
        }
    }
}





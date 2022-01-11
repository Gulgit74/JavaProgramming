package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        String[]countries = { "Japan","Korea","United States","Turkey","Unites Kingdom", "Canada"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p-> p.length() >= 10);

        //converting arrallist to array

        countries = list.toArray(new String[0]); // any number can write

        System.out.println(Arrays.toString(countries));
    }
}

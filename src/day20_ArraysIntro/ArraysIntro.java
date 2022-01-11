package day20_ArraysIntro;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create avariable that's capable enough to contain 5 names
        String [ ]myGroup = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";


        System.out.println(Arrays.toString(myGroup)); //hashcode verir() icini doldurunca nall keys-non primitives
                                                                                   //["Gunay", "Neira", "Suat", "Hulya", "Mikael"]
        System.out.println("----------------------------");
        String[ ] days = {"Monday","Tuesday", "Wednesday", "Thurday", "Friday", "Saturday","Sunday"};
            // index:              0                  1                 2                         3        4              5                  6
        System.out.println(Arrays.toString(days));
        int number = 12;
        if(number<1 || number>7){
            System.out.println("Invalid number");
            System.err.println();
            System.exit(0);
        }
        System.out.println(days[number-1]);

    }
}

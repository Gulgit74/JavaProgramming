package day28_Task;


import java.util.ArrayList;

public class ZeroIntegerArrayList {
    /*1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];

     */
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);

        list.set(4,0);

        System.out.println("list ="+list);

    }

}

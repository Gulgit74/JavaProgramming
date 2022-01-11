package day20_ArraysIntro;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int [] numbers = {10, 5 , 4, 20, 1, 0}; //first think 10 is max num. this is assumption
        int max = numbers[0]; // 10...

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]> max){// if there is element in the arrays that's greater than the current max number

                max = numbers[i]; // assigning greater number to variable max


            }

        }
        System.out.println(max);



    }
}

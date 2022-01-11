package arrays_Five;
import java.util.*;
import java.util.Scanner;

public class SumOfNumbers {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
            int sum = 0;
            for (int each : nums) {
                sum += each;
            }
            System.out.println(sum);
        }
    }



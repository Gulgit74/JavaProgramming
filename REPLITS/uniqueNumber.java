import java.util.Scanner;

public class uniqueNumber {
    public static void main(String[] args) {
   /*     Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints. Every single unique int should be printed from the new line.
`Example:`
`Example:`
`input:[2, 5, 5, 6, 3, 6, 9, 34, 3]`
`input:[2, 5, 5, 6, 3, 6, 9, 34, 3]`
`output:`
`output:`
`2`
`2`
`9`
`9`
`34`*/
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();

            // printUniqueNumbers(nums);

/*public static String uniqueChars(String str) {


        String unique = "";
        for (int i = 0; i <str.length() ; i++) {
            if(!unique.contains(str.charAt(i)+"")){
               unique+=str.charAt(i);
            }

        }
        return unique;
    public static void printUniqueNumbers(int[] nums){
    }

 */
    /* public static void printUniqueNumbers(int[] nums){
      for (int num : nums) {
            int count = 0;
            for (int element : nums) {
                if(num==element){
                    count++;
                }
                }
            if(count==1){
                System.out.println(num);
    */
        }
    }
}
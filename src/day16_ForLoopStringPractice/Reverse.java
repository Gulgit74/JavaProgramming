package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String result = " ";
     /*
        result += str.charAt(11); //n
        result += str.charAt(10);
        result += str.charAt(9);
        result += str.charAt(8);
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);//w

        System.out.println(result);
        */

      //  for (int i = 11; i >= 0; i--) {
       //  result += str.charAt(i);

           // System.out.println("Hello Word");


        for (int i = str.length() - 1; i >= 0; i--)

    {  //  i start last index to index zero
        result += str.charAt(i);
    }
                System.out.println(result);

        }

    }


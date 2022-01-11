package day17_While_DoWhile.day17_While_DoWhile;

public class JavaFrequency {

    public static void main(String[] args) {

     //String str = "JavaJavaJava";
        //   String str ="JavaJava";

        //   substrings:
        //1. Java  //substring(0,4)
        //2. avaJ  // substring(1,1+4)
        //3. vaJa  // substring(2, 2+4)
        //4. aJav  // substring (3, 3+4)
        //5. Java //substring(4, 4+4)
        System.out.println("--------------------");

        String str = "Java Java Java Python";
        int frequency = 0;

        for(int i = 0; i<= str.length()-4; i++){
            String eachSub =  str.substring(i, i+4);

            if(eachSub.equals("Java")){

                frequency++;

            }

        }
        System.out.println(frequency);

       // Delete 1st Java:
            //  "Java Java Python"

        //Delete 2d Java:
              //  "Java Python"

        //Delete 3rd Java:
                 //"Python"





    }
}

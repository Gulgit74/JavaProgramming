package day17_While_DoWhile.day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {


        //Substring Method:
        String str = "JavaJava";
        int frequency = 0;

        for( int i = 0; i < str.length()-3; i++){
            String eachSub =  str.substring(i,i+4);

                    if(eachSub.equals("Java")){
                        frequency++;
                    }
        }

        System.out.println(frequency);



    }
}
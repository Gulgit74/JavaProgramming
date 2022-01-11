package day27_WrapperClases.day24_CustomMethod_Returm;

public class FrequencyReturnMethodPractice3 {

    public static void main(String[] args) {
      String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {

            int frequency = frequency(str, str.charAt(i));
            if (frequency == 1) {
                System.out.println(str.charAt(i));
            }
        }

        frequency(str, 'a');
    }

    public static int frequency(String str, char ch) {

        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;

            }

        }

        return count;

/*public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence ="java java java python python";
        String word = "java";

        int result= frequencyOfWord(sentence,word);

        System.out.println(result);
    }

   public static int  frequencyOfWord(String sentence,String word){

        int count =0;
       String sentemce1[]=sentence.split(" ");

       for (String each : sentemce1) {
           if(each.contains(word)){
               count++;
       }

        }
        return count;
   }

}*/
    }

}

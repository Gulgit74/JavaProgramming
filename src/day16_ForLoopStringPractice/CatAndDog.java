package day16_ForLoopStringPractice;

public class CatAndDog {

    public static void main(String[] args) {

        /*5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
*/
        String s = "caT dog dogG cAt";
        String word1 = "cat";
        String word2 = "dog";
        int w1 = 0;
        int w2 = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (s.toLowerCase().contains(word1)) {
                s.toLowerCase().replaceFirst(word1, "");
                w1++;
            }
            if (s.toLowerCase().contains(word2)) {
                s.toLowerCase().replaceFirst(word2, "");
                w2++;
            }


        }
        System.out.println(w1 == w2);

        System.out.println("-------------------------");
        String str = "Cat cat Dog Dog ";

        int frequency = 0;

        for(int i = 0; i <=str.length()-3; i++){
            String eachSub =  str.substring(i, i+3);

            if(eachSub.equalsIgnoreCase("Cat")){
                frequency++;

            }
        }
        System.out.println(frequency);
    }
}
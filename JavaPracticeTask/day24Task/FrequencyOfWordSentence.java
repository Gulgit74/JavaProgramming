package day24Task;

public class FrequencyOfWordSentence {
    /*1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3*/
  public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "java";
        System.out.println(frequencyOfWord(sentence,word));
//    frequencyOfWord(sentence, word) ==>  3
    }

    public static int frequencyOfWord(String sentence, String word) {
        String[] newArr = sentence.split(" ");
        int frequency = 0;
        for (String each : newArr) {
            if (each.equalsIgnoreCase(word)) {
                frequency++;
            }
        }
        return frequency;


    }

}

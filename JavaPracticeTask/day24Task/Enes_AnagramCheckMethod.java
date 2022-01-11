package day24Task;

public class Enes_AnagramCheckMethod {

        public static void main(String[] args) {
            String word1="Oh my Dear,  Forget your Fear,  Let all your Dreams be Clear,  Never put Tear";
            String word2="Please Hear,I want to tell one thing in your Ear… Wishing you a Very Happy New Year!";
            String result=anagramCheck(word1,word2);
            System.err.println(result);

        }
        public static String anagramCheck(String str1,String str2){
            String result="";
            if(str1.length()==str2.length()){
                result=str1+" "+" and "+""+str2+" are anagram";
            }else{
                result=str1+" "+"and"+ " "+str2+" are not anagram";
            }
            return result;
        }
    }





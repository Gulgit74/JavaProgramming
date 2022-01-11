package day19_NestedLoop1;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);// each characters of str
                if (ch == each) {
                    count++;
                }


            }
            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;
            result += count;
        }

        System.out.println(result);
   /* public static void main(String[] args) {
        String str = "aabcccd ";
        String result = "";

        char ch = str.charAt(0)
         int count = 0;

        for (int j = 0; j < str.length(); j++) {

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if (ch == each) {
                    count++;

                }
                if (result.contains(" " +ch)) {
                    continue;
                }

                result += ch;
                result += count;

            }

        }
        System.out.println(result);

    }*/
    }
}
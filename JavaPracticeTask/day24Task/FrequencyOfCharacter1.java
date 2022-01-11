package day24Task;

public class FrequencyOfCharacter1 {
    public static void main(String[] args) {
        String str = "aaabbnnnjjkk";
        String result= " ";


            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                int count = 0;

                for (int i = 0; i < str.length(); i++) {
                    char each = str.charAt(i);// each characters of str
                    if (ch == each) {
                        count++;
                    }

                }
                if (result.contains(" "+ch)){
                    continue;
                }

                result += ch;
                result+= count;
            }

            System.out.println(result+" ");


     /*   System.out.println("------------------");


                String str = "aabccd";
                String result = " ";

                for (int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);
                    int count = 0;

                    for (int i = 0; i < str.length(); i++) {
                        char each = str.charAt(i);// each characters of str
                        if (ch == each) {
                            count++;
                        }


                    }
                    if (result.contains(""+ch)){
                        continue;
                    }

                    result += ch;
                    result+= count;
                }


        System.out.println(result);
*/
    }
}

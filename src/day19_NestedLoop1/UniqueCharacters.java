package day19_NestedLoop1;

public class UniqueCharacters {

    public static void main(String[] args) {
        char ch = 'a';
        String str = "";
        String result = "";
        int count = 0; // represents the frequency of the ch

        for (int i = 0; i < str.length(); i++) {
           char each = str.charAt(i);
             if (ch == each) {
                count++;
                for (int j = 0; j < str.length(); j++) {

                    char hc = str.charAt(j); //'A'
                    //nt count = 0; // represents the frequency of the ch

                    for (int u = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                        char two = str.charAt(u); // each character of str

                            count++;
                        }
                    }

/*
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
 */
                    if (count != 1) {
                        continue;
                    }

                    result += ch;

                }


                System.out.println(count);
                System.out.println(result);


            }


       /* String str = "aabccdeef";
        String result = "";

        char ch = 'a';
        int count = 0; // represent the frequency of the ch
        char each =str.charAt(i);
        for (int j = 0; j < str.length(); j++) {
            char b = str.charAt(j);
            //int count = 0; // represent the frequency of the ch

            for (int i = 1; i < str.length(); i++) {// compares character that outer loop picked,
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
                result += ch;
                result += count;
            }
            //result += ch;
            // result += count;
        }

            if (count == 1) {// if the frequency is 1, then character is unique
                result += ch;
            }

        System.out.println(result);

        }
    }
*/

        }
    }


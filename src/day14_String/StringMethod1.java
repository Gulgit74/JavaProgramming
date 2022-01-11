package day14_String;

public class StringMethod1 {

    public static void main(String[] args) {

        String str1 = "    batch   25    ";// btw words not remowed the space.Only unneccary space at the beggining and end.
        str1 = str1.trim();

        System.out.println(str1);
String str2 = "Cydeo School";


String str3 = "Java Programming Language";
int n3 = str3.indexOf("an");
int n4 = str3.indexOf("gua");
        System.out.println("n4 =" + n4);
        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 ="+ n5);
        System.out.println("------------------------------");

        String s = "Java Nova Cava Wava orange";
        int LastA = s.lastIndexOf("a ");
        int firstA = s.lastIndexOf("a");
        int secondA = s.indexOf("a");
        int thirdA = s.indexOf("a C");
        int forthA = s.lastIndexOf("av ");
        int fifthA = s.lastIndexOf("va ");

        System.out.println("firstA =" + firstA);
        System.out.println("secondA =" + secondA);
        System.out.println("thirdA =" + thirdA);
        System.out.println("forthA =" + forthA);
        System.out.println("fifthA =" + fifthA);



    }
}

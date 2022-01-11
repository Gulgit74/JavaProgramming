package day15_ForLoop;

public class StringMethod {

    public static void main(String[] args) {
        String str = "       ";//Blank space
        boolean r = str.isEmpty();
        System.out.println(r);

        String str2 = "Cydeo  ";// NOT Blank
        System.out.println(r);

        System.out.println("-------------------------------");

        String sentence = "My favorite programming language is Java";
        boolean hasCSarp = sentence.contains("C#");//    no Ignore Method for Contains
        boolean hasJava =  sentence.contains("Java");
        boolean hasJava2 =  sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java") || sentence.contains("Java");

        System.out.println(hasCSarp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("-----------------------");
        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);









    }
    }



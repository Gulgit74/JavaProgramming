package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {


        String[] names = {"Ece Erken", "Sinem Kaya", "Shopia Key", "Sevgul Tanriverdi", "Nesibe Sabanci", "Koray Basoglu", "Aynur Fidan", "Ozgul Sonmez", "John Real", "Melek Gul"};

        for (String each : names) {

            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);
            System.out.println(initial);
        }

    }

}






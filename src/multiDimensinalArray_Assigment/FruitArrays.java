package multiDimensinalArray_Assigment;

public class FruitArrays {
    public static void main(String[] args) {
        /*
        2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water}};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

         */
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        //  String[][] array = new String[items.length][items[0].length];
/*
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.println(items[i][j]+ "\t");

            }
            System.out.println(" ");


            }
        System.out.println("----------------------");

        for (int i = 0; i < items.length; i++) {
            for (int j = items.length - 1; j>= 0; j--) {
                System.out.println(items[i][j]+ "\t");

            }
            System.out.println("---------------");
        }
        }*/

        for (String[] eachItem : items) {
            System.out.println();
            for (String element : eachItem) {
                System.out.print(element+"\t");
            }

        }
        System.out.println();
        System.out.println("---------------------------");
        String reversed = " ";
        for (int i = 0; i < items.length; i++) {
            System.out.println();

            for (int j = items[i].length - 1; j >= 0; j--) {

                System.out.print( items[i][j]+"\t");

            }
        }

        System.out.println();
        System.out.println("---------------------");



        for (int i = items.length - 1; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }

        }

    }

}
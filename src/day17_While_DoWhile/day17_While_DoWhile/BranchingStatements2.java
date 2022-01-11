package day17_While_DoWhile.day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {
        String str = "Even numbers";
        //String result = "";
        int i = 1;
        for (i = 1; i <= 11; i++) {
            if (i % 2 != 0) { //1  3 5 7 9
                continue; // Skip


            }

            System.out.println(i);

            System.out.println("------------");


        }

       /* for(char i = 'A'; i <= 'E' ; i++){
            if(i == 'C'){
                continue;
            }
            System.out.println(i); //A B C D

        }
        System.out.println("-----------------");

    }
}*/
    }
}
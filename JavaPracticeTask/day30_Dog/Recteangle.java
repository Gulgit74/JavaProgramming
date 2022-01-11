package day30_Dog;

public class Recteangle {

    /**********
     **** ****
     ***   ***
     **     **
     *       *
     **     **
     ***   ***
     **** ****
     *********
     */
    public static void main(String[] args) {

        for (int i = 1; i<10; i++){
            for (int j = 1; j<10; j++){
                if (i==2 && j==5){
                    System.out.print(" ");
                    continue;
                }
                if (i==3 && (j==4 || j==5 || j==6)){
                    System.out.print(" ");
                    continue;
                }
                if (i==4 && (j==3 || j==4 || j==5 || j==6 || j==7)){
                    System.out.print(" ");
                    continue;
                }
                if (i==5 &&( j==2 || j==3 || j==4 || j==5 || j==6 || j==7 || j==8)){
                    System.out.print(" ");
                    continue;
                }
                if (i==6 && (j==3 || j==4 || j==5 || j==6 || j==7)){
                    System.out.print(" ");
                    continue;
                }
                if (i==7 && (j==4 || j==5 || j==6)){
                    System.out.print(" ");
                    continue;
                }
                if (i==8 && j==5){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

package day4_UnitTest2Solution_Dec22;

public class DoWhileLoop2 {
    public static void main(String[] args) {

        int a = 0;

        do {
            a = a++ + --a - (a % 3);
        } while (++a < 4);

        System.out.println(a);
        System.out.println("---------------");
        String s = "I will find the lost book";
        String word = " ";
        //for (int index = s.length() - 1; index<=1; i--) {
       // System.out.println("------------");

       // int count =0;
/*
        for(int a=0; a<4; a++){
            if(a ==3)continue;

            for(int b= a+1;  b<5; b++){
                count++;

                if(b==3)break;

            }
        }
        System.out.println(count);*/
        }
    }


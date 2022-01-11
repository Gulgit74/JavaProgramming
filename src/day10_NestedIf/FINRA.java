package day10_NestedIf;

public class FINRA {

    public static void main(String[] args) {

/*3. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
                  output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
*/
int number = 16;

//String result = (num1%3 ==0)? "FIN" : (num1%5 == 0)? "RA" : (num1%15 ==0)? "FINRA";

                if (number%3==0 && number%5!=0){
                    System.out.println("FIN");
                }else if (number%5==0 && number%3!=0){
                    System.out.println("RA");
                }else if (number%3==0 && number%5==0){
                    System.out.println("FINRA");
                }else{
                    System.out.println("invalid");
                }



    }


}



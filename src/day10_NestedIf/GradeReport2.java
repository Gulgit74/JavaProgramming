package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

          int score = 400;

        if (score >= 0 && score <= 100) { // If score is valid

            if (score >= 60) {// If student pass the exam
                System.out.println("Passed");

            } else { // if student failed the exam
                System.out.println("Failed");
            }
        } else {// if score is not valid
            System.out.println("Invalid score");



      /*  }
        System.out.println("-----------------------------");

        int age = 25;
        if(age >= 21){
            System.out.println("Eligible to buy alcohol");
        }
        if(age <21){
            System.out.println("Not eligible to buy alcohol");*/
        }




    }
}

package day20_ArraysIntro_Assigments;

public class ClassGrade {

    public static void main(String[] args) {

        /*4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A


	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
*/
      String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        String result = "";
        for (int i = 0; i < grades.length; i++) {
          /* grades[0] = 'A';
           grades[1] = 'B';
           grades[2] = 'C';*/

              if(scores [i] == 90){
                  grades [i] = 'A';

              }else if(scores[i] ==75){
                  grades[i] = 'C';

              }else{
                  grades[i] ='B';
              }
               result += names[i] + " 's score is " +""+ scores[i]  +" " + ", and grade is " + "" + grades[i] + "." +"\n";



        }

            System.out.println(result);

        }



    }/* for (int i = 0; i <names.length; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 75) {
                grades[i] = 'C';
            }
        }

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);
    }*/








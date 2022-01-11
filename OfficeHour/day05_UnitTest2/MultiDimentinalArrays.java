package day05_UnitTest2;

import java.util.Arrays;

public class MultiDimentinalArrays {

    public static void main(String[] args) {

        String[] scrum1 = {"Aysegul", "Timur", "Oleksandra"};
        String [] scrum2 = {"Ali", "Olga", "Jilili"};
        String[] scrum3 = {"Sergie", "Yuliya", "Frangez"};

        String [][] scrumteams = {{"Aysegul", "Timur", "Oleksandra"},{"Ali", "Olga", "Jilili"}, {"Sergie", "Yuliya", "Frangez"} };
                                // {scrum1, scrum2, scrum3}  ikisi de ayni
        System.out.println(Arrays.deepToString(scrumteams));
        System.out.println(scrumteams[1][1]);

        System.out.println("-------------------------");

        for(String[] eachScrum : scrumteams) {

            System.out.println(Arrays.toString(eachScrum));
        }
            System.out.println("-------------------");

            for(String[] eachScrum: scrumteams){
                for(String eachName : eachScrum){
                    System.out.println(eachName+" ");
                }
            }
        }
    }


package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {

    /*    1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School

        For Any Other grade: Invalid grade level given

        NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
*/
        byte gradeLevel = 15;
        String result = "";
        if (gradeLevel >= 1 && gradeLevel <= 16) {

            if (gradeLevel >= 1 && gradeLevel <= 5) {
                result = "Elementry School";
            } else if (gradeLevel >= 6 && gradeLevel <= 8) {
                result = "Middle School";
            } else if (gradeLevel >= 9 && gradeLevel <= 12) {
                result = "High School";

            } else if (gradeLevel >= 13 && gradeLevel <= 16) {
                result = "College";
            } else {
                result = "Grad School";
            }
        } else {
            result = "Invalid grade level given";
        }

            System.out.println(result);

        }
    }

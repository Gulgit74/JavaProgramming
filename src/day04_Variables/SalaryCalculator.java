package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours =40;
        int numOfWeeks =52;
        int salary = hourlyRate * weeklyHours * 52;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks ="+ numOfWeeks);
        System.out.println("salary =$ " + salary);


    }




}

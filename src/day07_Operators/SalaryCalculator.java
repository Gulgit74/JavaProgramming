package day07_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {



    /*3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTax, federalTax

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560

     */

    int hourlyRate = 50;
    int  weeklyHours = 45;
    double stateTax = 6.5;
    double  federalTaxRate = 26.2;


    int salaryBeforeTax = hourlyRate * weeklyHours * 52;
    double stateTaxPay = salaryBeforeTax * stateTax / 100;
    double federalTaxPay = salaryBeforeTax * federalTaxRate / 100;
    double totalTax = stateTax + federalTaxRate;
    double salaryAfterTax = salaryBeforeTax - totalTax;
    double GrossPay = salaryBeforeTax + totalTax;



        System.out.println("Gross pay is : $" + salaryBeforeTax);
        System.out.println( " State tax is : $" + stateTax);








}

}

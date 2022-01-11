package day31_Task;

public class SalaryCalculator {

    /*1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
*/
    /*
public double hourlyRate,stateTaxRate, federalTaxRate;
//public double stateTaxRate;
//public double federalTaxRate;
int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    //public double salary() {
        //System.out.println("salary="+ salary);
        // return salary= hourlyRate *weeklyHours*52}
        //public double stateTax
        //return

        // double stateTax = (hourlyRate*weeklyHours*52)*stateTaxRate;
        // return


  */ public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }

    public double stateTax(){
        return salary()*(stateTaxRate/100);
    }

    public double federalTax(){
        return salary()*(federalTaxRate/100);
    }

    public double salaryAfterTax(){
        return salary()-(stateTax()+federalTax());
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= $" + hourlyRate +
                ", stateTaxRate= $" + stateTaxRate +
                ", federalTaxRate= $" + federalTaxRate +
                ", salaryAfterTax= $" + salaryAfterTax() +
                '}';
    }
}

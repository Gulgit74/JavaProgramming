package day37_Inheritance.ScrumTask;

public class BusinessAnalist extends Employee {

    public BusinessAnalist(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyze", id, salary, companyName);
    }

    public void analyze() {
        System.out.println(name + " is analyzing the documents");

    }
}
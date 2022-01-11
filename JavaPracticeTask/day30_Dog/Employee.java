package day30_Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
    /*
    Attributes:
    name, id, gender, jobTitle, salary, isFullTime(boolean)

    Actions:
    toString(): to be bale to print each employee object
    setInfo(): to be able to set all the attributes
    work()...

  */

  Employee employee1 = new Employee();
  Employee employee2 = new Employee();
  Employee employee3 = new Employee();
  Employee employee4 = new Employee();
  Employee employee5 = new Employee();

  Employee[] employees = {employee1, employee2, employee3,employee4, employee5};

    public String name;
    public String ID;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;


    public void setInfo(String name, String ID, char gender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
    public void work(){
        System.out.println(name + " is working");
    }
    /*
    public void work(){
        System.out.println(name +" is working");
        ArrayList<Employee> fullTime =new ArrayList<>();
        for(String employee:employees){
            if(employee.isFullTime){
                fullTime.add(employee);
            }
        }
        System.out.println(fullTime);
        double max = employee1.salary;
        double min = employee2.salary;

    }*/
}





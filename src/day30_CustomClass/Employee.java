package day30_CustomClass;

public class Employee {


    public String name;
    public int id;
    public char gender;
    public int age;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, int id, char gender, int age, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
    public void work(){
        System.out.println(jobTitle+" "+name +" is working");
    }


}

/*
Employee Class:
		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */




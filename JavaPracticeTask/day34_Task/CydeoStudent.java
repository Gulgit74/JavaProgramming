package day34_Task;

public class CydeoStudent {
    /* 2. create a class named CydeoStudent
        Variables:
        name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

        Add a constructor to initialize all the fields

        Add a static block to initialize all the statics

        methods:
        printSchoolName();
        printSecretCode();
        attendClass():
        study()
        toString()

     */


    public String name, fieldOfStudy;
    public int age, batchNumber, groupNumber;
    public char gender;
    public static String schoolName,secretCode,programmingLanguage;

    public CydeoStudent(String name, int age, int batchNumber, int groupNumber, char gender) {
        this.name = name;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }
    static {
        schoolName= "Cydeo";
        programmingLanguage = "Java";
        secretCode ="Wooden Spoon";

    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(schoolName);
        System.out.println(secretCode);

    }
    public void  attandClass(){
        System.out.println(name+"is attending class");

    }
    public void study(){
    //student1.study();
    //student2.attendClass();
   // student3.study();


}
    }
package day34_GarbegeCollection_AccesModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName) {
        this.studentName = studentName;
        schoolName = "Cydeo School";
  // public CydeoStudent(String studentName);
        this.studentName = studentName;
    }

    static {
        schoolName = "Cydeo School";
    }
}
class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Jimy");
        CydeoStudent student2 = new CydeoStudent("Kathy");

        System.out.println("student1.schoolName");
        System.out.println("student2.schoolName");

    }
}

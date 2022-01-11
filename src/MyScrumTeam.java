import java.util.ArrayList;
import java.util.Arrays;
/*
public class MyScrumTeam {
    public static void main(String[] args) {

        day31_Constructors.scrumtask.Tester tester1 = new day31_Constructors.scrumtask.Tester("Layan", 11, "QA", 110000);
        day31_Constructors.scrumtask.Tester tester2 = new day31_Constructors.scrumtask.Tester("Ali", 43, "SDET", 142000);
        day31_Constructors.scrumtask.Tester tester3 = new day31_Constructors.scrumtask.Tester("Alex", 44, "SE", 135000);
        day31_Constructors.scrumtask.Tester tester4 = new day31_Constructors.scrumtask.Tester("Lala", 23, "SDET", 115000);

        day31_Constructors.scrumtask.Tester[] testers = {tester2, tester3, tester4};

        day31_Constructors.scrumtask.Developer developer1 = new day31_Constructors.scrumtask.Developer("Olga", 22, "Java Developer", 125000);
        day31_Constructors.scrumtask.Developer developer2 = new day31_Constructors.scrumtask.Developer("Aygun", 39, "Java Master", 185000);
        day31_Constructors.scrumtask.Developer developer3 = new day31_Constructors.scrumtask.Developer("Tunc", 13, "Senior Developer", 135000);
        day31_Constructors.scrumtask.Developer developer4 = new day31_Constructors.scrumtask.Developer("Sinem", 13, "Senior Develepor", 200000);

        day31_Constructors.scrumtask.Developer[] developers = {developer2, developer3, developer4};

        day31_Constructors.scrumtask.ScrumTeam scrum = new day31_Constructors.scrumtask.ScrumTeam("Nigara", "Huseyin","Neira",14 );

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("------------------------------------------------------");

        for(day31_Constructors.scrumtask.Tester eachTester : scrum.testersList){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }

        System.out.println("------------------------------------------------------");

        for (day31_Constructors.scrumtask.Developer eachDeveloper: scrum.devopsList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
        }

        System.out.println("------------------------------------------------------");

        scrum.removeTester( 23 );
        scrum.removeDeveloper( 22 );

        System.out.println(scrum);



    }

}

class Tester{ public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;


    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
    public void smokeTesting() {
        System.out.println(name + "is smoke testing");
    }
    public void creatingTicket () {
        System.out.println(name + " is creating ticket");
    }
}

class Developer{public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }
}

class ScrumTeam{ public String PO, BA,SM;
    public ArrayList<day31_Constructors.scrumtask.Tester> testersList = new ArrayList<>();
    public ArrayList<day31_Constructors.scrumtask.Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        //this.testerList = testerList;
        //this.devopsList = devopsList;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(day31_Constructors.scrumtask.Tester tester) {
        testersList.add(tester);
    }
    public void addTesters(day31_Constructors.scrumtask.Tester[] testers){
        testersList.addAll(Arrays.asList(testers));

    }

    public void addDeveloper(day31_Constructors.scrumtask.Developer developer){
        devopsList.add(developer);

    }
    public void addDevelopers(day31_Constructors.scrumtask.Developer[]developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        // testersList.removeIf(p -> p.employeeID == employeeID);
        testersList.removeIf( p ->  p.employeeID == employeeID );
    }
    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p -> p.employeeID == employeeID);

    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }

}

 */

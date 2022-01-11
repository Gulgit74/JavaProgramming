package day36_Task.SportsTask;

public class Sport {
    public String name,rules;
    public int numberofPlayers, numberOfRefere;

    public void setInfo(String name, String rules, int numberofPlayers, int numberOfRefere) {
        this.name = name;
        this.rules = rules;
        this.numberofPlayers = numberofPlayers;
        this.numberOfRefere = numberOfRefere;
    }

     public void play(){
         System.out.println(name+ " is playing");
     }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberofPlayers=" + numberofPlayers +
                ", numberOfRefere=" + numberOfRefere +
                '}';
    }
}

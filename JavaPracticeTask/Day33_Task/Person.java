package Day33_Task;

public class Person {
    public String name;
    public int age;
    public char gender;

    public static boolean isHuman = true;
    public static boolean hasNose = true;
    public static int numberOfHead = 1;
    public static int numberOfEyes = 2;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+ " eats only Java Tasks nowadays.");
    }
    public void drink(){
        System.out.println(name+" drinks lots of Coffee and Tea.");
    }
    public void sleep(){
        System.out.println(name+" is looking for the definition of the word \"sleep\" anymore. ");
    }
    public void whoCouldBe(){
        System.out.println(name+" must be Cydeo Student");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

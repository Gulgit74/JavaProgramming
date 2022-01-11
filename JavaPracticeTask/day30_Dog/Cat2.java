package day30_Dog;

public class Cat2 {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String color;

    public void setInfo(String name, String breed, int age, char gender, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    public String toString() {
        return "Cat2{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }
public void eat(){
    System.out.println(name +"is eating");
}

public void drink(){
    System.out.println(name+ "is drinking milk");
}

    }




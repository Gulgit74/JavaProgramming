package day34_GarbegeCollection_AccesModifiers.day35_Encaptusulation.encapsulation;

public class PersonOblect {

    public static void main(String[] args) {

        Person p1= new Person();
       // p1.name= "Daniel";
        p1.setName("Daniel");
        p1.setAge(28);

        System.out.println(p1.getName()+":"+p1.getAge());
    }
}
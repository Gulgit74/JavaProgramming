package day37_Inheritance.animalTask;

public class AnimalObject {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alex", "Husky", 'M', 2, "Small", "White");

        System.out.println(dog1);

        dog1.bark();
        //dog.scrach();
        //dog1.sing();


        Cat cat1 = new Cat("Love", "Siamese", 'F', 2, "Large", "Black");
        System.out.println(cat1);
        cat1.scratch();
        //cat1.bark();
        //cat1.sing();

        Parrot parror1 = new Parrot("King", "Macaw", 'M', 3, "Small", "Blue");
        //  System.out.println(parrot1);

        parror1.sing();
//      parrot1.bark();
//      parrot1.scratch();
    }
}

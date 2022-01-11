public class Dog {

        public String name;
        public String breed;
        public int age;
        public char gender;
        public String size;
        public String color;


        public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
            name=dogName;
            breed=dogBreed;
            age=dogAge;
            gender=dogGender;
            size=dogSize;
            color=dogColor;
        }
        public void eat(){
            System.out.println(name+" is eating");
        }

        public void bark(){
            System.out.println(name+" is barking");
        }
        public String toString(){
            return"Dog{"+
                    "name='"+name+'\''+
                    ", breed='"+breed+'\''+
                    ", age="+age+
                    ", gender="+gender+
                    ", size='"+size+'\''+
                    ", color='"+color+'\''+
                    '}';

        }
}

class DogObject{
    public static void main(String[] args) {

        Dog dog1  = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        Dog dog2 = new Dog();

        dog2.name = "ACE" ;
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("-----------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        //ArrayList<Dog> femaleDogs =new ArrayList<>();
       // ArrayList<Dog> maleDogs =new ArrayList<>();
    }

}

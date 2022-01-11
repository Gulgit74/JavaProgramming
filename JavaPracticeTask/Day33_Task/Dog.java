package Day33_Task;

public class Dog {

    public String name;
    public String bread;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName,String dogBread,int dogAge,char dogGender,String dogSize, String dogColor){
      this.name = dogName;
      this.bread= dogBread;
      this.gender = dogGender;
      this.size = dogSize;
      this.color = dogColor;
    }

// Action(instance Methods)

    public void eat(){
        System.out.println(name+"is eating");
    }
   public void sleep() {
    System.out.println(name + "is sleeping");
    }
    public void play() {
        System.out.println(name + "is playing");
    }
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }



    }






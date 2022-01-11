package day34_Task;
import static day33_Statics.Iphone.*;
public class Iphone {
    /*1. Create a class named Iphone
        variables:
        brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

        Add a constructor to initialized all the fields

        Add a static block to initialize all the statics

        Methods:
        printOperatingSystem(): displays the operating system of the iphone
        call(long phoneNumber)
        text(long phoneNumber)
        faceTime(long phoneNumber)
        faceTime(String email)
        toString()
}

     */
    public String model, color, size;
    public double price;
    public static String OS, brand, madeIn, designedIn;
    public static boolean isSmarPhone;

    public Iphone(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    static {
        OS = "IOS";
        brand = "Apple";
        madeIn = "China";
        designedIn = "California";

    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(OS);
        System.out.println(brand);

    }

    public void call(long phoneNumber) {
        System.out.println(phoneNumber + "is calling");
    }

    public void text(long phoneNumber) {
        System.out.println(phoneNumber + "is texting");

        // }public void faceTime(phoneNumber );

    }
}
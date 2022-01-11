package day30_CustomClass;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carPrice) {

        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        price = carPrice;
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }


    public void drive() {
        System.out.println(("Driving" + brand + "" + model));
    }

    public void start() {
        System.out.println(brand + " is starting");
    }

    public void stop() {
        System.out.println(brand + "is stopping");

    }
}
/*
Car Class:

    Attributes:
        brand, model, color, year, price

    Actions:
        drive(), start(), stop(), toString(), setInfo()
      }
    }

*/

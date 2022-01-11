package day37_Inheritance.phoneTask;

public class Samsung extends Phone{
    public Samsung(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void freez(){
        System.out.println(brand + " " + model + " is freezing");
    }

}

/*
Create a subclass of Phone named Samsung:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    freeze()
                    toString());
    }
}

 */


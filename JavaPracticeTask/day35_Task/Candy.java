package day35_Task;

public class Candy {
     /*
    1. CandiesTask
         1.1 Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0


      */

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if(quantity<= 0){
            return;
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price<0){
            return;
        }
        this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;

    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }


    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + ((price ==0)?price:"free") +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
    /*
    public String isFree(){
        String free="";
       if(price==0)free+="Free";
       else free+=price;
       return free;
    }
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + isFree() +
                ", hasPeanuts=" + hasPeanuts +
                '}';
     */
}
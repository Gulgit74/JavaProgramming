package day32_Constructors;

public class Carpet {
    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice += 200;
        }

        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }


}

/*
1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)

}

 */


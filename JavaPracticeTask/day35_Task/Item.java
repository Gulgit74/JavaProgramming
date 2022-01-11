package day35_Task;

public class Item {
    /*4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
     */

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);

    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.out.println("Invalid name " + name);
            System.exit(0);
        }
        if (!(name.charAt(0) >= 'a' && name.charAt(0) <= 'z' || name.charAt(0) >= 'A' && name.charAt(0) < 'Z')) {
            System.out.println("Invalid name " + name);
            System.exit(0);
        }
        for(int i=0; i<name.length(); i++) {
            if (!(name.charAt(i) >= 65 && name.charAt(i) <= 90) && name.charAt(i) >= 97 && name.charAt(i) <= 122 && name.charAt(i) == 32
                    ||(name.charAt(i)>=48&&name.charAt(i)<=57)) {
                System.out.println("Invalid name " + name);
                System.exit(0);
            }
        }

        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.out.println("Invalid unit price " + unitPrice);
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid quantity " + quantity);
            System.exit(0);
        }
        if (name.toLowerCase().contains("toilet")) {
            this.quantity = 1;
        }
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calcCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total price =" + calcCost() +
                '}';
    }
}
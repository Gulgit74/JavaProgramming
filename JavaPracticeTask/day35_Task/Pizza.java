package day35_Task;

public class Pizza {
    /*
     Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping



     */



    private String size;
    private int numberOfCheeseTopping,  numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
  public double calcCost(String size, int numberOfCheeseTopping,int numberOfPepperoniTopping) {
      double price = (size.equalsIgnoreCase("small")) ? 10 : size.equalsIgnoreCase("medium") ? 12 : 14;
     price += numberOfCheeseTopping*2 + numberOfPepperoniTopping*2;
     return price;
  }
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                "PizzaCost= $" +calcCost(size, numberOfCheeseTopping, numberOfPepperoniTopping)+
                '}';
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        if(numberOfCheeseTopping<0 || numberOfPepperoniTopping<0){
            System.out.println("invalid topping number");
            System.exit(0);
        }else if(!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))){
            System.out.println("Invalid topping number");
            System.exit(0);
        }else if(size.equalsIgnoreCase("samll") && (numberOfCheeseTopping>3 || numberOfPepperoniTopping>4)){
            System.out.println("Invalid topping number");
            System.exit(0);
        }else if(size.equalsIgnoreCase("medium")&&(numberOfCheeseTopping>4  || numberOfPepperoniTopping>5)) {
            System.out.println("Invalid topping number");
            System.exit(0);
        }else if(size.equalsIgnoreCase("large")&&(numberOfCheeseTopping>5 || numberOfPepperoniTopping>6)){
            System.out.println("Invalid topping number");
            System.exit(0);
        }


    }

    public static void main(String[] args) {
            Pizza pizza1=new Pizza("large", 4, 5);
            System.out.println(pizza1);
            Pizza pizza2=new Pizza("smalL", 4, -1);
            System.out.println(pizza2);
        }

    }

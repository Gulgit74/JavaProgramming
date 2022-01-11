package day35_Task;

public class Square {
    /* Square Task:
		1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement

     */
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
        if(side<=0){
            return;
        }
        this.side=side;
    }
    public Square(int side){
        setSide(side);
    }
    public int calcArea(){
        int area =side*side;
        return area;
    }public int calcPerimeter(){
        int perimeter=side*4;
        return perimeter;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                " area="+calcArea()+
                " perimeter="+ calcPerimeter()+
                '}';
    }

    public static void main(String[] args) {
        Square square1 = new Square(2);
        System.out.println(square1);
    }
}

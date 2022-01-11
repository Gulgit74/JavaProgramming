package day35_Task;

public class Rectangle {
    /*
}Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement


     */
    private double width,length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        if(width<=0){
            return;
        }
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        if(length<=0){
            return;
        }
        this.length=length;
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }
    public double calcArea(){
        return length*width;

    }
    public double calcPerimeter(){
        return 2*(length +width);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                " area="+calcArea()+
                " perimeter="+ calcPerimeter()+
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4.2,5.1);
        System.out.println(rectangle1);
    }
}

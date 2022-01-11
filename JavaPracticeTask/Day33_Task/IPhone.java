package Day33_Task;

public class IPhone {

        public String model, color, size;
        public int price;
        public static String brand="Apple";
        public static String OS="iOs";
        public static String madeIn="China";

        public IPhone(String model, String color, String size, int price) {
            this.model = model;
            this.color = color;
            this.size = size;
            this.price = price;
        }
        public void faceTime(long phoneNumber){
            System.out.println(model+" "+color+" "+phoneNumber+" is face time");
        }

        public void faceTime(String email){
            System.out.println(email+" is calling face time");
        }
        public void call(long phoneNumber){
            System.out.println(phoneNumber+" is calling");
        }
        public void text(long phoneNumber){
            System.out.println(phoneNumber+" is for text");
        }


        public String toString() {
            return "Iphone{" +
                    "model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", size='" + size + '\'' +
                    ", price=" + price +
                    '}';
        }
    }


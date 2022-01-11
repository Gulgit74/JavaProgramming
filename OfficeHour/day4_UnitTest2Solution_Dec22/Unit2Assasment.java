package day4_UnitTest2Solution_Dec22;

public class Unit2Assasment {

    public static void main(String[] args) {
        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);//s2 = ame was tied at 2-2

        int index1 = s.indexOf("game");//int index1 =4
        int index2 = s.indexOf("game");// if game is not in our string index2= -1

        if(index1 == index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }
    }
}

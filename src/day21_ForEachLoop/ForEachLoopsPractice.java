package day21_ForEachLoop;

public class ForEachLoopsPractice {
    public static void main(String[] args) {


String[] words = {"Java Programing", "Cydeo Scool", "Wooden Spoon", "Early Birds","Angry Bird"};

     for(String each: words){
          System.out.println(each.charAt(0) + each.charAt(each.length()-1));

}


    }
}

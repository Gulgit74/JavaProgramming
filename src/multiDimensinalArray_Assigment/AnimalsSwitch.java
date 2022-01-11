package multiDimensinalArray_Assigment;

public class AnimalsSwitch {
    public static void main(String[] args) {
/* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */

        String animal = "CAT";
        String result = " ";

        switch(animal){
            case "DOG":
           //case "CAT     can write Cat under this line because thay have same result
             result =   "domestic animal ";
            break;
            case "CAT":
                result = "domestic animal";
                break;
            case "TIGER":
                        result =  "wild  animal";
                        break;
            default:
                result = "unknown animal";
                break;

        }
        System.out.println(animal);
    }
}

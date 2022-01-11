package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizenship = "USA";

        boolean isEligible = age >= 21 && citizenship == "USA";

        if(!isEligible){
            System.out.println(name + "is eligible" + citizenship);
        }
        else{
            System.out.println(name + "is not eligeble" + citizenship);
        }

    }
}

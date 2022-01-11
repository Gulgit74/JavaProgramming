package day34_GarbegeCollection_AccesModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    static{//this block runs first and only one time run.Static blocks cannot run more than one time
        System.out.println("Static Block");
    }
static{
    System.out.println("Staic Block 2");
}
static{
    System.out.println("Static Block 3");
}
}

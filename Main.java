package Gamblingsimulator;

public class Main {
    public static void main(String[] args) {
        Gambler g1=new Gambler();
        g1.setStack(100);
        System.out.println("stack given for each gambler="+g1.getStack());
        GamblerService gs =new GamblerService();
        gs.limits(g1);
        gs.game(g1);
        System.out.println(g1.getStack());
    }
}
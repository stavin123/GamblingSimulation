package Gamblingsimulator;

public class Main {
    public static void main(String[] args) {
        Gambler g1=new Gambler();
        g1.setStack(100);
        System.out.println("stack given for each gambler="+g1.getStack());
        GamblerService gs =new GamblerService();
        //gs.limits(g1);
        gs.noofgames(g1);
        gs.resign(g1);

        for (int i = 0; i < g1.getNumberOfGames(); i++) {
            gs.game(g1);
            System.out.println(g1.getStack());
            if (g1.getStack() == g1.getLosspercentage()|| g1.getStack() == g1.getWinpercentage())
                break;

        }

    }
}
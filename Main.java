package Gamblingsimulator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GamblerList> arr=new ArrayList<>(20);
        Main m=new Main();

        for (int i = 0; i < 20; i++) {
            arr.add(m.Day());

        }
    }

    GamblerList Day(){
        Gambler g1=new Gambler();
        g1.setStack(100);
        System.out.println("stack given for each gambler="+g1.getStack());
        GamblerService gs =new GamblerService();
        GamblerList gl=new GamblerList();
        //gs.limits(g1);
        gs.noofgames(g1);
        gl.setArray(g1);
        gs.resign(g1);

        for (int i = 0; i < g1.getNumberOfGames(); i++) {
            gs.game(g1);
            System.out.println(g1.getStack());
            gl.addValue(g1,i);
            if (g1.getStack() == g1.getLosspercentage()|| g1.getStack() == g1.getWinpercentage())
                break;

        }
        

        gl.showlist(g1);
        System.out.println("Stack at the end of the Day = "+g1.getStack());


        return gl;
    }
}
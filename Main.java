package Gamblingsimulator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Gambler g1=new Gambler();
        g1.setStack(100);
        System.out.println("stack given for each gambler="+g1.getStack());

        GamblerService gs =new GamblerService();
        GamblerList gl=new GamblerList();
        int j=0,wincount=0,losscount=0;
        while ( j < 5){
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

            wincount+= g1.getWc();
            losscount+=g1.getLc();
        gl.showlist(g1);
        System.out.println("Stack at the end of the Day = "+g1.getStack());

            j++;

        }


        System.out.println("Total no. of win after 20 days = "+wincount);
        System.out.println("Total no. of looses after 20 days = "+losscount);
    }


}
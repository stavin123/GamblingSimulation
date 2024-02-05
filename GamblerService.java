package Gamblingsimulator;

import java.util.Scanner;

public class GamblerService {
    Scanner sc=new Scanner(System.in);
   /* public void limits(Gambler g){

        System.out.println("Enter the highest limit of the stack that has to be reached");
        int hl= sc.nextInt();
        g.setHightLimit(hl);
        System.out.println("Enter the Lower limit of the stack that has to be reached");
        int ll= sc.nextInt();
        g.setLowLimit(ll);
    }*/


    public  void noofgames(Gambler g){
        System.out.println("Enter the no. of games you want to play today");
        int n=sc.nextInt();
        g.setNumberOfGames(n);
    }
    public void game(Gambler g){
        g.setBet(1);
        System.out.println("bet = "+g.getBet());
        double rn=Math.floor(Math.random()*10)%2;
        if (rn==0){
            System.out.println("bet lost");
            g.setStack(g.getStack()-1);
            g.setLosses(g.getLosses()+1);
            g.setWinLoss("Loss");
        }
        else {
            System.out.println("bet won");
            g.setStack(g.getStack()+1);
            g.setWins(g.getWins()+1);
            g.setWinLoss("Won");
        }
    }
    public  void resign(Gambler g){

        int a= (int) ( g.getStack()*(0.5));
        g.setWinpercentage(g.getStack()+a);
        g.setLosspercentage(g.getStack()-a);
        System.out.println("Higher limit for the day ="+g.getWinpercentage());
        System.out.println("Lower limit for the day ="+g.getLosspercentage());
    }

}

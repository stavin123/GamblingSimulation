package Gamblingsimulator;

import java.util.Scanner;

public class GamblerService {
    public void limits(Gambler g){
        Scanner sc=new Scanner(System.in);

        // Setting Higher limit
        System.out.println("Enter the highest limit of the stack that has to be reached");
        int hl= sc.nextInt();
        g.setHightLimit(hl);

        //Setting Lower limit
        System.out.println("Enter the Lower limit of the stack that has to be reached");
        int ll= sc.nextInt();
        g.setLowLimit(ll);
    }

    public void game(Gambler g){
        g.setBet(1);
        System.out.println("bet = "+g.getBet());
    }
}

package Gamblingsimulator;

import java.util.Scanner;

public class GamblerService {
    public void limits(Gambler g){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the highest limit of the stack that has to be reached");
        int hl= sc.nextInt();
        g.setStack(hl);
        System.out.println("Enter the Lower limit of the stack that has to be reached");
        int ll= sc.nextInt();
        g.setStack(ll);
    }

    public void game(Gambler g){
        g.setBet(1);
        System.out.println("bet = "+g.getBet());
    }
}

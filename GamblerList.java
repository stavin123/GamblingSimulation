package Gamblingsimulator;

import java.util.ArrayList;
import java.util.List;

public class GamblerList {

    List<Gambler> al=new ArrayList<>();

    void setArray(Gambler g){
        List<Gambler> al=new ArrayList<>(g.getNumberOfGames());
    }

    void addValue(Gambler g,int i){
        al.add(i,g);
    }
    void showlist(Gambler g){
        System.out.println("Wins and Losses at the end of the Day");
        for(Gambler i : al){
            System.out.println(i);
        }
    }

}

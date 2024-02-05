package Gamblingsimulator;

import java.util.ArrayList;
import java.util.List;

public class GamblerList {

    List<String> al=new ArrayList<>();

    void setArray(Gambler g){
        List<String> al=new ArrayList<>(g.getNumberOfGames());
    }

    void addValue(Gambler g,int i){
        al.add(i,g.getWinLoss());
    }
    void showlist(Gambler g){
        System.out.println("Wins and Losses at the end of the Day");
        for(String i : al){
            System.out.println(i);
        }
    }

}

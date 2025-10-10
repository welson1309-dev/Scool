package PokerApp;

import java.util.ArrayList;

public class PokerPlayer {
    String name;
    int goldmoney;
    ArrayList<PokerCard> hand;

    public PokerPlayer(String name, int goldmoney){
        this.name=name;
        this.goldmoney=goldmoney; //konstruktor
        this.hand= new ArrayList<>();

    }
    public void addCard(PokerCard nytKort){
        hand.add(nytKort);
    }

}


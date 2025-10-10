package PokerApp;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDeck {
    ArrayList<PokerCard> deck;

    public PokerDeck() {
        deck = new ArrayList<>();
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Bonde", "Dronning", "Konge", "Es"};

        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new PokerCard(suit, rank));
                //System.out.println("Kort nummer" + (index + 1) + ": " + rank + " af " + suit);
                index++;
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
    public PokerCard drawCard(){
        return deck.remove(0);
    }

    public void givKort(ArrayList<PokerPlayer> spillere, int antalkort) {
        for (int i = 0; i < antalkort; i++) {
            for (PokerPlayer spiller : spillere) {
                if (!deck.isEmpty()) {
                    spiller.addCard(drawCard());
                }
            }
        }
    }
}

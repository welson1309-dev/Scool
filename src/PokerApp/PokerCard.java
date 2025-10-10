package PokerApp;

public class PokerCard {
   private String suit;
   private String rank;

   public PokerCard(String suit,String rank){
       this.suit=suit;
       this.rank=rank;
   }
   public String getSuit(){
       return suit;
   }
   public String getRank(){
       return rank;
   }

    public String toString() {
        return rank+" af "+suit;
    }
}

package PokerApp;

import java.util.ArrayList;
import java.util.Scanner;


public class MainPoker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Velkommen til texas Hold' em!");


        System.out.println("hvor mange spillere?");
        int antalSpillere = input.nextInt();
        input.nextLine();

        if(antalSpillere>10){
            System.out.println("for mange spillere, sætter antal til 10!");
            antalSpillere=10;
        }
        ArrayList<PokerPlayer> spillere = new ArrayList<>();

        for(int i=0; i<antalSpillere; i++){
            System.out.println("indtast navn for spiller Nr."+ (i+1)+": ");
            String navn = input.nextLine();

            System.out.println("velkommen "+ navn +"!");
            System.out.println("hvor mange gold moneys vil du gerne starte med?");
            int startMoney = input.nextInt();
            input.nextLine();

            spillere.add(new PokerPlayer(navn, startMoney));
        }
        PokerDeck deck= new PokerDeck();
        deck.shuffle();
        System.out.println("decket er blandet!\nvi er klar til at give kort!");


        deck.givKort(spillere, 5);



    }
}


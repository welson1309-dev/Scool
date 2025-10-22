package sebsrpg;

import java.util.Scanner;

public class Kriger extends chars {
            public Kriger(String name) {
                super(5, 30, name, 250, 250, 35, 5);
    }
    public void slash(chars target){
        mkFysiskSkade=15;
        System.out.println(name + " angriber ->" + target.name+"!");
        System.out.println("med Slash!");

        int randSkade = fysiskSkade + rand.nextInt(10);
        target.tagSkade(randSkade,0);
    }
    public void block(){
        System.out.println("du tager dit skjold op og beskytter dig selv imod næste slag!");

    }

    public void kampMenu(Scanner scn, chars fjende) {
        System.out.println("Hvad gør du nu?");
        System.out.println("***Muligheder***");
        System.out.println(" 1 = slash\n 2 = block");

        int choice = scn.nextInt();
        scn.nextLine();

        if (choice == 1) {
            slash(fjende);
            } else if (choice == 2){
            block();


        }
    }
}
package sebsrpg;

import java.util.Scanner;

public class Jaette extends chars {
    public Jaette(String name) {
        super(5, 17, name, 250, 250, 35, 5);
    }
    public void braenslag(chars target){
        System.out.println(name + " angriber ->" + target.name+"!");
        System.out.println("med Brændslag!");

        int randSkade = fysiskSkade + magiskSkade + rand.nextInt(10);
        target.tagSkade(randSkade,0);
    }
    public void frostSlag(chars target){
        System.out.println(name + " angriber ->" + target.name+"!");
        System.out.println("med Frostslag!");
        int randSkade = fysiskSkade + magiskSkade + rand.nextInt(5);
        target.tagSkade(randSkade,0);

    }
    public void kampMenu(Scanner scn, chars fjende) {
        System.out.println("Hvad gør du nu?");
        System.out.println("***Muligheder***");
        System.out.println(" 1 = Brændslag\n 2 = Frostslag");

        int choice = scn.nextInt();
        scn.nextLine();

        if (choice == 1) {
            braenslag(fjende);
        } else if (choice == 2){
            frostSlag(fjende);


        }
    }
}
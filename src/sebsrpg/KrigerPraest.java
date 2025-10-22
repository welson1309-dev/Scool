package sebsrpg;

import java.util.Scanner;

public class KrigerPraest extends chars {
    public KrigerPraest(String name) {
        super(5, 0, name, 200, 200, 10, 25);
    }
    public void kpHeal(){
        System.out.println("du healer dig selv!");
        System.out.println("med Helligt lys");
        System.out.println(" ");
        int randheal = magiskSkade + rand.nextInt(15);
        currentHealth += randheal;
        if (currentHealth > maxHealth) currentHealth =maxHealth;
        System.out.println(" Healede " + randheal + "HP er nu " + currentHealth);
    }
    public void monkBonk(chars target){
        System.out.println("du slår " + target.name+"!!");
        System.out.println("med Monkbonk!");
        int randSkade = magiskSkade + fysiskSkade + rand.nextInt(10);
        target.tagSkade(randSkade,0);
    }
    public void kampMenu(Scanner scn, chars fjende) {
        System.out.println("Hvad gør du nu?");
        System.out.println("***Muligheder***");
        System.out.println(" 1 = Monkbonk\n 2 = Helligt lys");

        int choice = scn.nextInt();
        scn.nextLine();

        if (choice == 1) {
            monkBonk(fjende);
            } else if (choice == 2){
            kpHeal();
        }

        }
    }


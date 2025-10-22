package sebsrpg;

import java.util.Random;
import java.util.Scanner;

public class chars {
    Random rand=new Random();
    public int mkMagiskSkade;
    public int mkFysiskSkade;
    public String name;
    public int currentHealth;
    public int maxHealth;
    public int fysiskSkade;
    public int magiskSkade;
    public boolean isAlive;


    public chars(int mkMagiskSkade, int mkFysiskSkade, String name,
                 int currentHealth, int maxHealth, int fysiskSkade, int magiskSkade){
        this.mkMagiskSkade=mkMagiskSkade;
        this.mkFysiskSkade=mkFysiskSkade;
        this.name=name;
        this.currentHealth=currentHealth;
        this.maxHealth=maxHealth;
        this.magiskSkade=magiskSkade;
        this.fysiskSkade=fysiskSkade;
        this.isAlive=true;
    }


    public void healing(int magiskSkade){
        int pendingHeal = magiskSkade + rand.nextInt(10);
        if (pendingHeal < 0) pendingHeal=0;
        currentHealth += pendingHeal;
    }

    public void tagSkade(int fysiskSkade, int magiskSkade) {
        int pendingDMG = (fysiskSkade - mkFysiskSkade) + (magiskSkade - mkMagiskSkade);
        if (pendingDMG < 0) pendingDMG=0;
        currentHealth -= pendingDMG;

        if (currentHealth <= 0){
            currentHealth= 0;
            isAlive = false;
        }
        System.out.println(name + " tog " + pendingDMG + " skade!");
        System.out.println("HP er nu: " + currentHealth);
        System.out.println("");

    }
    public void npcAngreb(chars target) {
        System.out.println(name + " angriber!");
        int randskade = fysiskSkade + rand.nextInt(10);
        target.tagSkade(randskade, 0);
    }
    public void kampMenu(Scanner scn, chars fjende) {
        System.out.println("Ingen abilities!");
    }


}

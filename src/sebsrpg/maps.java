package sebsrpg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class maps {
    public static chars player;
    public static int currentLocation;
    public maps(chars player){
        this.player = player;
        this. currentLocation = 1;

    }
    public static void mapStart(){
        Scanner scn=new Scanner(System.in);
        System.out.println("du er " + player.name);
        while(player.isAlive){
            visLoc();
            System.out.println("hvad vil du gøre nu?\n Tryk = 1 for at gå videre \n tryk 2 = se stats \n Tryk: 3 = Afslut");
            int choice = scn.nextInt();

            if (choice ==1){
                currentLocation++;
                haandterLocation();
            } else if (choice ==2 ) {
                showStats();
            } else if (choice ==3){
                break;
            }

        }
        System.out.println("spillet afsluttes!");
    }
    public static void visLoc(){
        System.out.println("\n** du er ved " + currentLocation + "**");
        if (currentLocation == 1){
            System.out.println("du står ved indgangen til Guildet!");
        }
    }
    public static void haandterLocation(){
        if (currentLocation == 2) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Velkommen til guildet!");
            System.out.println("Hvad vil du gerne nu?\n***Valg muligheder!***\n ");
            System.out.println(" 1 = se stats\n 2 = gå ud på quest!\n ");
            int choice = scn.nextInt();
            if (choice ==1){
                showStats();
            }else if(choice == 2){
                currentLocation++;
            }else{
                return;
            }

        }if (currentLocation == 3){
            chars ork = new chars(5,5,"Ork",100,100,20,0);
            kamp(ork);
        }else if (currentLocation == 4){
            chars storOrk = new chars(10,10,"Stor ork",200,200,20,20);
            kamp(storOrk);
        }else if (currentLocation == 5){
            System.out.println("du fandt skatten!");
            player.isAlive = false;
        }
    }

    public static void kamp(chars fjende){
        Scanner scn = new Scanner(System.in);
        System.out.println("\n!!\n** Du bliver angrebet af " + fjende.name +"!!!**");

        while (player.isAlive && fjende.isAlive){
            System.out.println("***Vælg en handling!**\n*** 1=slås 2=Flygt ***");
            int choice = scn.nextInt();

            if (choice==1){
               player.kampMenu(scn, fjende);
                if (fjende.isAlive){
                    fjende.npcAngreb(player);
                }else {
                    System.out.println("du vandt over" + fjende.name + "!");
                }
            }else {
                System.out.println("du flygtede!");
                currentLocation--;
                break;
            }
        }
    }

    public static void showStats(){
        System.out.println("\n*** Karakter Stats! ***");
        System.out.println("HP " + player.currentHealth + "/" + player.maxHealth);
        System.out.println("fysisk skade = " + player.fysiskSkade);
        System.out.println("Magisk Skade = " + player.magiskSkade);
    }

}

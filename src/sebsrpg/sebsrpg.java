package sebsrpg;

import java.util.Scanner;

public class sebsrpg {
    public static void main(String[] args) {
        sebsrpg.startMenu();
    }
    public static void startMenu(){
        Scanner scn =new Scanner(System.in);
        Boolean koreSpil = true;

        while (koreSpil){
            System.out.println("***Velkommen til GuildHeim***");
            System.out.println("  *** vælg venligst *** ");
            System.out.println("   1 = Nyt Spil \n   2 = Load Spil \n   3 = Afslut ");
            int choice = scn.nextInt();
            scn.nextLine();
                if (choice ==1){
                    chars player = valgAfKarakter(scn);
                    maps map1 = new maps(player);
                    maps.mapStart();
                } else if (choice == 2){
                    System.out.println("funktion ikke live endnu");
                    break;
                } else if (choice == 3) {
                    koreSpil = false;
                    System.out.println("\n ***du har lukket spillet***");
                    break;
                }
        }
    }
    public static chars valgAfKarakter(Scanner scn){
        boolean vaelger=true;

        System.out.println("Vælg hvilken helt du vil spille med!");
        System.out.println(" Tryk 1 for Krigeren Manse\n Tryk 2 for Krigerpræsten Manfred\n Tryk 3 for Jætten Ylva");
        int choice = scn.nextInt();
        scn.nextLine();
        while(vaelger){
            if (choice==1){
                return new Kriger("Manse");
            }else if(choice==2){
               return new KrigerPraest("Manfred");
            }else if(choice ==3){
                return new Jaette("Ylva");
            }else{
                System.out.println("ugyldigt valg ");
                sebsrpg.valgAfKarakter(scn);
            }
        }
        return null;
    }

}
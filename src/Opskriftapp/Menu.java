package Opskriftapp;

import java.io.IOException;
import java.util.Scanner;

public  class Menu {
    protected static boolean køre = true;

    public static void start () throws IOException {
        Scanner scn = new Scanner(System.in);

        while (køre){
            System.out.println();
            int valg;
            System.out.println("Velkommen til menu'en.");
            System.out.println("Vælg om du vil oprette en ny opskrift, søge på en opskrif \n"+
                    "eller afslutte menuen.");
            System.out.println();
            System.out.println("1: Opret ny opskrift *** 2: søg efter en opskrift *** 3: Afslut menu'en.");
            valg = scn.nextInt();


            switch(valg){
                case 1:
                    Opskrift.opretOpskrift();
                    break;
                case 2:
                    soegfunk.nyOpskrift();
                    System.out.println("søg efter en opskrift");
                    String key= scn.nextLine();
                    scn.nextLine();
                    soegfunk.soeg(key);
                    break;
                case 3:
                    køre = false;
                    break;
            }
        }

    }
}

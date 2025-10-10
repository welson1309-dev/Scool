package Opskriftapp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Opskrift {
    String titel;
    int antalPersoner;

    public Opskrift(String titel, int antalPersoner) {
        this.titel = titel;
        this.antalPersoner = antalPersoner;
    }

    public static void opretOpskrift() throws IOException {
        Scanner scn = new Scanner(System.in);
        ArrayList<Opskrift> list = new ArrayList<>();
        ArrayList<String> trinList = new ArrayList<>();
        ArrayList<String> ingredienser = new ArrayList<>();

//
        int i = 0; //skal deklæres før loop
        boolean mere = true;
        boolean mereTrin;
        boolean mereIngedienser;
        while (mere) {
            mereTrin = true;
            mereIngedienser = true;
            i++;
            System.out.println("********");
            System.out.println("Opskrift nr." + i);
            System.out.println("Titel:");
            String titel = scn.nextLine();
            System.out.println("Antal Personer:");
            int antalPersoner = scn.nextInt();
            System.out.println("********");
            scn.nextLine();

            while(mereIngedienser){
                System.out.println("Hvor mange ingredienser vil du tilføje nu?");
                int antalIngredienser = scn.nextInt();
                scn.nextLine();

                for(int l = 0; l < antalIngredienser; l++){
                    System.out.println("hvad hedder ingrediensen " + (l + 1) + ": ");
                    String ingrediens = scn.nextLine();
                    ingredienser.add(ingrediens);
                }

                    System.out.println("Vil du tilføje flere ingredienser?");
                    System.out.println("Y/N :");
                    if (!scn.nextLine().equalsIgnoreCase("y")){
                        mereIngedienser = false;
                    }
            }
            // While loop for ingredienser

            while(mereTrin){
                System.out.println("Hvor mange trin vil du tilføje:");
                int antalTrin = scn.nextInt();
                scn.nextLine();


                for(int h =0; h <antalTrin; h++){
                    System.out.println("beskriv næste trin "+(h+1)+": ");
                    String trin = scn.nextLine();
                    trinList.add(trin);

                }

                System.out.println("Vil du tilføje flere?");
                System.out.println("Y/N :");
                if (!scn.nextLine().equalsIgnoreCase("y")) {
                    mereTrin = false;
                }
            } // While loop trin

            // Printer til .txt fil
            //Evt. loop? og noget som giver id.

            FileWriter reg = new FileWriter("C:\\bbbiii\\opskrifter.txt",true); // seperat metode.
            PrintWriter ud = new PrintWriter(reg);

            ud.println("********\n");
            ud.println("Opskrift nr: "+i+ "\n");
            ud.println("Titel: " + titel + "\n");
            ud.println("Antal Personer: " + antalPersoner + "\n");
            ud.println("Ingredienser: \n");
            for (int j = 0; j < ingredienser.size(); j++) {
                ud.println((j + 1) + ") " + ingredienser.get(j) + "\n");
            }
            ud.println("Trin:\n");
            for (int k = 0; k < trinList.size(); k++) {
                ud.println((k + 1) + ") " + trinList.get(k) + "\n");
            }
            ud.close();
            System.out.println("*** Opskrift gemt. ***");
            System.out.println();
            System.out.println("Vil du tilføje flere opskrifter?");
            System.out.println("Y/N :");
            if (scn.nextLine().equalsIgnoreCase("n")) {
                mere = false;
            }
        } //While loop


    }//Opret opskrift metode


}//Opskrift class


package RPGS;

import javax.swing.*;
import java.util.Scanner;

public class Textbasedrpgto {

    public static void main(String[] args) {

        //system variabler
        Scanner keyboard = new Scanner(System.in);
        String userInput = "";
        //char userInput = "";
        String rødFarve = "\u001B[31m";
        String farveReset = "\u001B[30m";

        //spiller variabler
        int positionX = 5;
        int positionY = 5;
        String weapon = "Knuckles";
        Boolean goblinLever = true;

        System.out.println(rødFarve + "velkommen til TBRPG to" + farveReset);

        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("hvad vil du gerne gøre, min gode ridder? \n" +
                    "N - gå mod nord \n" +
                    "E - gå mod øst \n" +
                    "S - gå mod syd \n" +
                    "W - gå mod vest \n");
            System.out.println(positionX + ", " + positionY);


            userInput = userInput.toUpperCase();

            userInput = keyboard.nextLine();


            switch (userInput) { //"N " og "N" er ikke det samme  "N "!="N"
                case "n":
                case "N":
                    System.out.println("du har valgt at gå imod nord");
                    positionY++;
                    if(positionY ==10){
                        System.out.println(rødFarve + "u ded, bliv på banen" + farveReset);
                    keepGoing =false;}

                    dans();
                    break;
                case "e":
                case "E":
                    System.out.println("du har valgt at gå imod øst ");
                    positionX--;
                    if(positionX ==0){
                        System.out.println(rødFarve + "u ded, bliv på banen \n" +
                                "GAME OVER" + farveReset);
                        keepGoing = false;
                        break;

                    }
                    break;
                case "s":
                case "S":
                    System.out.println("du har valgt at gå mod syd");
                    positionY--;
                    break;
                case "w":
                case "W":
                    System.out.println("du har valgt at gå mod vest");
                    positionX++;
                    break;
                default:
                    System.out.println("hov, du skrev noget forkert, prøv igen :)");
            }

            if (positionX > 10 && positionY < 0)

                if (positionX == 3 && positionY == 3) {
                    if (goblinLever == true) {
                        System.out.println("godblinen har taget mig tilfange, åh nej hjælpe mig.");
                    } else {
                        System.out.println("tak, big strong man, i live");
                        System.out.println("tillykke du har vundet");
                        keepGoing = false;
                    }
                }
            if (positionX == 8 && positionX == 2) {
                System.out.println("ayo u got the sword");
                weapon = "Swærd";
            }

            if (positionX == 4 && positionY == 8) {
                System.out.println("ayo, big fight \n" +
                        "du slår ham med" + weapon);
                if (weapon.equals("dit swærd")) {
                    System.out.println("godlin got fucked");
                } else {
                    JOptionPane.showMessageDialog(null, rødFarve + "u ded\n Game over" + farveReset);
                    //System.out.println(rødFarve + "u ded" + farveReset);
                    break;
                }
            }


        }


    }

    static void dans() {

    }
}

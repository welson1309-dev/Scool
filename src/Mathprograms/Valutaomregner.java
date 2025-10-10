package Mathprograms;

import javax.swing.*;
//import java.util.Scanner;

public class Valutaomregner {
    public static void main(String[] args) {
        //Scanner keyboard = new Scanner(System.in); behøves ikke når jeg brug popup
        //String userInput = "";
        JTextField valutaFelt = new JTextField();
        JTextField beloebFelt = new JTextField();
        //her over har jeg defineret mine skrive felter.

        double sek = 1.47;
        double nok = 1.55;
        double eur = 0.13;
        double isk = 19.16;
        double dkk = 1;
        //koden under er et array som giver 4 forskellige ting, 2 string beskeder, og 2 skrive felter.
        Object[] besked = {
                "vælg valuta: EUR, ISK, NOK, SEK.", valutaFelt,
                "beløb", beloebFelt
        };

        int option = JOptionPane.showConfirmDialog(null, besked, "Valuta Omregner", JOptionPane.OK_CANCEL_OPTION); //koden lige over giver mig en OK og cancel mulighed i min joptionpane

        if (option == JOptionPane.OK_OPTION) {
            String valuta = valutaFelt.getText().toUpperCase();
            String beloebtext = beloebFelt.getText();

            try {
                double beloeb = Double.parseDouble(beloebtext);
                JOptionPane.showMessageDialog(null, "du har valgt at veksle " + beloeb + " DKK til " + valuta);
                double resultat = (double) 0;


                switch (valuta) {
                    case "EUR":
                        resultat = beloeb * eur;
                        break;
                    case "ISK":
                        resultat = beloeb * isk;
                        break;
                    case "NOK":
                        resultat = beloeb * nok;
                        break;
                    case "SEK":
                        resultat = beloeb * sek;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ugyldigt valg", "fejl", JOptionPane.ERROR_MESSAGE);
                        return;
                }
                JOptionPane.showMessageDialog(null, resultat + " " + valuta);
            } catch (NumberFormatException e) {  //laver tallet vi får i popup til et tal som kan bruges i koden
                JOptionPane.showMessageDialog(null, "ugyldigt valg", "fejl", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
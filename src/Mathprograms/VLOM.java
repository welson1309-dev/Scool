package Mathprograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VLOM {
    public static void main(String[] args) {
        System.out.println("velkommen til valuta omregner");
        Scanner input=new Scanner(System.in);
        double beloeb;
        double udskrift;
        double sek=1.4;
        double eur=2.5;
        double usd=2.4;
        double nok=4.5;
        double dkk=1;
        int brugerValg;
        String valutaNavn;
        DecimalFormat df=new DecimalFormat("0.00");
        Scanner scn=new Scanner(System.in);


        while (true){
            System.out.println();
            System.out.println("indtast beløb du gerne vil omregne");
            System.out.println("(tast 0 for at afslutte");
           beloeb=scn.nextDouble();
            if(beloeb==0)break;
            System.out.println("tast 1 for sek");
            System.out.println("tast 2 for eur");
            System.out.println("tast 3 for usd");
            System.out.println("tast 4 for nok");
            brugerValg= scn.nextInt();


            switch (brugerValg){
                case 1: udskrift=beloeb/sek;
            }
            System.out.println(beloeb+"DKK bliver til ");
            scn.close();
        }






    }
}

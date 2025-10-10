package Mathprograms;

import java.util.Random;
import java.util.Scanner;

public class proggæt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int hemmeligtTal = random.nextInt(100) + 1; // 1-100
        int gaet = 0;
        int antalGaet = 0;

        System.out.println("Jeg tænker på et tal mellem 1 og 100. Kan du gætte hvilket?");

        while (gaet != hemmeligtTal) {
            System.out.print("Indtast dit gæt: ");
            gaet = keyboard.nextInt();
            antalGaet++;
            System.out.println("Antal gæt indtil nu: " + antalGaet);

            if (gaet < hemmeligtTal) {
                System.out.println("Mit tal er større.");
            } else if (gaet > hemmeligtTal) {
                System.out.println("Mit tal er mindre.");
            } else {
                System.out.println("Tillykke! Du gættede rigtigt.");
                System.out.println("Du brugte " + antalGaet + " gæt.");
            }
        }

        keyboard.close();
    }
}


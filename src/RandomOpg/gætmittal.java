package RandomOpg;

import java.util.Random;
import java.util.Scanner;

public class gætmittal {


    public static void gætter() {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int hemmeligtTal = random.nextInt(20) + 1; // 1-20
        int gæt=0;


        System.out.println("Jeg tænker på et tal mellem 1 og 20. Kan du gætte hvilket?");

        while (gæt != hemmeligtTal) {
            System.out.print("Indtast dit gæt: ");
            gæt = keyboard.nextInt();

            if (gæt < hemmeligtTal) {
                System.out.println("Mit tal er større.");
            } else if (gæt > hemmeligtTal) {
                System.out.println("Mit tal er mindre.");
            } else {
                System.out.println("Tillykke! Du gættede rigtigt.");
            }
        }

        keyboard.close();
    }
}


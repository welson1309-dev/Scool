package DiceGame;

import java.util.Random;
import java.util.Scanner;

public class Betterdicemanlopp {
    public static void main(String[] args) {
        gætmittal.gætter();
        System.out.println("velkommen til bedre dice Loop");
        Random gen = new Random();
        boolean keepGoing=true;
        Scanner keyboard=new Scanner(System.in);


        while (keepGoing) {
            int tal;
            tal = gen.nextInt(6) + 1;
            String activity = switch(tal)  {
                case 1 -> "jump";
                case 2 -> "stand";
                case 3 -> "go";
                case 4 -> "sleep";
                case 5 -> "study";
                case 6 -> "eat candy";
                default -> "";
            }; System.out.println(activity);
        //    if (tal==6) keepGoing=false;
            System.out.println("vil du stoppe? (y/n)");
            String answer;
            answer=keyboard.next();
            if (answer.equals("y")) {
                keepGoing = false;
            } else if (answer.equals("n")) {
                keepGoing = true;
            }
            //if (answer.equals("y")) keepGoing=false;
            //if (answer.equals("n")) keepGoing=true;



        }/*
        int tal;
        tal = gen.nextInt(6) + 1;
        String activity = switch(tal)  {
            case 1 -> "jump";
            case 2 -> "stand";
            case 3 -> "go";
            case 4 -> "sleep";
            case 5 -> "study";
            case 6 -> "eat candy";
            default -> "";
        }; System.out.println(activity);
*/

    }
}

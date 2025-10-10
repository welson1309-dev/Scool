package sebsrpg;

import java.util.Random;
import java.util.Scanner;

public class actions {
    Random rand = new Random();
    Scanner scn = new Scanner(System.in);
    String move = scn.nextLine();


    public int attack() {
        return rand.nextInt(5) + 5;
    }

    public int block() {
        return rand.nextInt(3) + 3;
    }

    public int devineStrike() {
        return rand.nextInt(10) + 10;
    }
    /*switch (move) {
        case "1":
            System.out.println("you move forwards");
            break;
        case "2":
            System.out.println("you go backwards");
            break;
        default:
            System.out.println("you remain");
           break; */
    }

    public int frenMove() {
        return 0;
    }

    public int gangUpMove() {
        return rand.nextInt(20) + 20;
    }

    public int bisWepAttack() {
        return rand.nextInt(7) + 7;
    }
}
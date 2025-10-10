package DiceGame;

import java.util.Random;

public class Betterdiceman {
    public static void main(String[] args) {
        System.out.println("velkommen til bedre dice");
        Random gen = new Random();


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


    }
}

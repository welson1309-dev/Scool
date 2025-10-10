package DiceGame;

import java.util.Random;

public class Dice {
    static Random gen=new Random();
    int roll(){
        return gen.nextInt(6)+1;
    }

    public static void main(String[] args) {
        Dice d1=new Dice();
        Dice d2=new Dice();
        System.out.println("d1 "+d1.roll());
        System.out.println("d2 "+d2.roll());
    }
}

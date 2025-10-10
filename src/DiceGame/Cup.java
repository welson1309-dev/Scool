package DiceGame;

import java.util.Random;

public class Cup {
    Dice d1=new Dice();
    Dice d2=new Dice();
    int result1;
    int result2;

    void roll(){
        result1= d1.roll();
        result2= d2.roll();
    }
    int getSum(){
        return result1+result2;
        /*return result1;
        return result2;*/
    }

    public static void main(String[] args) {
        Cup cup=new Cup();
        for (int i=1; i<=10; i++){
        cup.roll();
        System.out.println(cup.getSum());
        }
    }
}

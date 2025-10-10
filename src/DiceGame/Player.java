package DiceGame;

public class Player {
    String name;
    Cup cup = new Cup();
    int point = 0;


    Player(String name) {
        this.name = name;
    }

    void turn(){
        cup.roll();
        point=point+cup.getSum();
    }

    public String toString(){
        return name + " " + point;
    }

    public static void main(String[] args) {
        Player p1=new Player("bo");
        while (p1.point<100) {
            p1.turn();
            System.out.println(p1);
        }

    }
}

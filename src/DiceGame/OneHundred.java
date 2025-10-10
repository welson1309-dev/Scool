package DiceGame;

public class OneHundred {
    Player p1=new Player("nolleee");
    Player p2=new Player("bemt");

    void play(){
        System.out.println(p1.name+"\t"+p2.name);
        while (p1.point<100 && p2.point<100) {
            p1.turn();
            //if(p1.point>100){break;}
            p2.turn();
            System.out.println(p1.point + "\t" + p2.point);
            }
            if(p1.point> p2.point){
                System.out.println("Nolleee vandt!\n med "+p1.point+"points");}
            if (p2.point> p1.point){
                System.out.println("Bemt vandt!\n med "+p2.point+"points");}
            if(p1.point == p2.point){
                System.out.println("Det blev uafgjordt, prøv igen :)");

        }
    }

    public static void main(String[] args) {
        OneHundred game=new OneHundred();
        game.play();
    }
}

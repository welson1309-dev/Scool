package RandomOpg;

import java.util.Random;

public class Platellerkrone {
    public static void main(String[] args){
        System.out.println("Velkommen til plat eller Krone");
        Random gen=new Random();

        int tal=gen.nextInt(2);
        if (tal==0) {
            System.out.println("Tillykke, Du fik plat!");
            System.out.println("uglæ ass");
        }
        else
            System.out.println("Tillykke, Du fik krone!");
    }
}

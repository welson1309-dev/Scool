package Mathprograms;

import java.util.Random;

public class Diceman {
    public static void main(String[] args) {
        System.out.println("Velkommen til diceman");
        Random gen;
        gen=new Random();

        int tal;
        tal=gen.nextInt(6)+1;
        String activity="";

        if (tal==1){
            activity="breakfast";
        } else
        if (tal==2) {
            activity = "jump";
        } else
        if (tal==3) {
            activity = "run";
        } else
        if (tal==4) {
            activity = "sit";
        } else
        if (tal==5) {
            activity = "sleep";
        } else
        if (tal==6) {
            activity = "train";
        }
        System.out.println(activity);}
}

package Mathprograms;

import java.util.ArrayList;

public abstract class figurApp {
    public static void main(String[] args) {
        ArrayList<Figur> list=new ArrayList<>();
        list.add(new punkt());
        list.add(new linje(3));
        list.add(new linje(5));
        list.add(new Rektangel(2,7));
        list.add(new Cirkel(4.6));
        Cirkel c1=new Cirkel(5.4);
        list.add(c1);
        c1.helloWorld();
        System.out.println(list);
        for (Figur f:list){
            System.out.println(f+" areal="+f.areal());
        }







        Object obj = new Object();
        obj.toString();








    }
}

abstract class Figur{
    double areal(){return 0;}
    double omkreds(){return 0;}
}
class punkt extends Figur {
    double areal() {return 0;}
    double omkreds() {return 0;}


    public String toString() {
        return "punkt";
    }
}
class linje extends Figur  {
    double laenge;        //meter
    linje (double l) {laenge=l;}
    double areal (){return 0;}
    double omkreds (){return 2*laenge;}

    public String toString() {
        return "linje længde= "+laenge;}
    }
class Rektangel extends Figur{
    double hojde;
    double Bredde;
    Rektangel(double h, double b){
        Bredde = b;
        hojde = h;
    }
    double areal(){return hojde*Bredde;}
    double omkreds(){return 2*hojde;}
    public String toString(){
        return "Rektangel højde= " + hojde+"Bredde="+Bredde;}
}

class Cirkel extends Figur{
    double radius;

    //Constructor
    Cirkel(double r) {
        radius = r;
    }

    double areal(){
        return Math.PI*radius*radius;
    }

    double omkreds(){
        return 2*Math.PI*radius;
    }

    String helloWorld() {
        System.out.println("hello world");
        return  "hello world";
    }

    public String toString() {
        return "Cirkel Radius="+radius+"Cirkel omkreds="+omkreds();
    }
}



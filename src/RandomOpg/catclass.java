package RandomOpg;

public class catclass {
    public static void main(String[] args) {
        System.out.println("velkommen til katteklip");
        kat a1= new kat("brun");
        kat  a2=new kat("orange");


    }
}
class kat{
   private String farve;
   boolean sulten;



    public kat(String f){
        farve=f;
        sulten=true;

    }


}

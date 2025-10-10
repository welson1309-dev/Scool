package RandomOpg;

public class Foedselsdaginv {
    public static void main(String[] args) {
        invitation("ole", "kaere");
        invitation("bo", "hejsa"); //actuelle parametre altså de actualle navne der skal stå
        invitation("lizz", "til");

    }

    static void invitation(String Navn, String Hilsen){ //formelle parametre, der hvor vi får at vide at actuelle skal stå
        System.out.println(Hilsen+" "+Navn);
        System.out.println("det vil glaede mig at se dig til min foedselsdag");
        System.out.println("uglae ass onsdag 14 i fjerde. dont come, ");
        System.out.println("bla bla");
        System.out.println(" ");
    }
}

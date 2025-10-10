package Mathprograms;

public class sumaf3method {
    public static void main(String[] args) { //void bliver skrevet til metoder der ikke skal give svar tilbage.

        // nedenunder - scope eller virkefelt
        int a=5;
        int b=7;   //int reservere en plads i hukommelsen, en variable
        int c=1;
        int sum=sum(a,b,c); //disse variable, bliver givet til metoden når jeg kalder den
        System.out.println("Sum= "+sum);
        System.out.println(sum(1,b,3));

    }

    static int sum(int a, int b, int c){   //metoden, med formelle parametre som får actuelle af scope
        int result;   //lokale variabel
        result=a+b+c;
        return result; //return er en kommando der giver resultat tilbage til kalderen
        //og vi har defineret result til at være summen af a+b+c
    }
}

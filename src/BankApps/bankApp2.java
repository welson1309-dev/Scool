package BankApps;

import java.time.LocalDate;
import java.util.ArrayList;

public class bankApp2 {
//main metoden, er der hvor programmet starter med at læse, ller program afvikling.
    public static void main(String[] args) {//void kan erstattet med andre datatyper, udfra hvilken der skal returneres
        System.out.println("velkommen til bankapp2"); //static betyder at metoden tilhøre klassen. og ikke et object
        Account a1; //lokale variabler, reference variable.
        a1=new Account("kenobi", 1.5);//vi har sagt new, så nu ligger det på heap
        Account a2=new Account("beno not", 1.5);
        Account a3 = new Account("benny", 2);
        a1.deposit(50);
        a1.withdraw(25);
        a1.annualInterest();
        a2.annualInterest();


        a1.printTransactions();
        a2.printTransactions();
        a3.printTransactions();

    }
}
//construktor
class Account { //private - kan kun ændres inde fra klassen.
    private int accountNo;
    protected String owner; //instants variable
    protected double balance;
    protected double interestRate; //rentesats
    protected ArrayList<Transaktion> transaktions=new ArrayList<>();
    static private int noOfAccounts=0; //skal være statisk så de ikke har hver deres tæller,
    //static starter før main nemlig.

    public Account(String ow, double ir){ //public kan kaldes ude fra metoden.
        noOfAccounts++;
        accountNo=noOfAccounts;
        owner=ow;
        balance=0;
        interestRate=ir;

    }
    public static int getNoOfAccounts(){
        return noOfAccounts;
    }
    public void deposit(double amount){
        balance=balance+amount;
        Transaktion t=new Transaktion("indsat", amount, balance);
        transaktions.add(t);

    }

    public void withdraw(double amount){
        balance=balance-amount;
        transaktions.add(new Transaktion("hævet", amount, balance));

    }
    public void annualInterest(){
        double interest=(balance*interestRate)/100;
        balance=balance+interest;
        transaktions.add(new Transaktion("renter",interest,balance));
    }
    public void printTransactions(){
        System.out.println(toString());
        System.out.println("Bevægelse\tdato\tbeløb\tsaldo");
        for (Transaktion t:transaktions){
            System.out.println(t);
        }
    }

    public String toString(){
        return "konto: "+accountNo+"\t"+owner+"\t"+balance+"\n";



    }


}
class Transaktion{
    String text;
    LocalDate date; //brug localDate.
    double amount;
    double newSaldo;

//mainloop, som spørger hvad vil du gøre næste gang.
    Transaktion(String text, double amount, double newSaldo){
        this.text=text;
        date=LocalDate.now(); //giver dagsdato .now(statisk metode af klassen localdate, der læser datoen på pc.
        this.amount=amount;
        this.newSaldo=newSaldo;



    }
    public String toString(){
        return text+"\t"+date+"\t"+amount+"\t"+newSaldo;
    }
}
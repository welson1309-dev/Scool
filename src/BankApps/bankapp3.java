package BankApps;

import java.time.LocalDate;
import java.util.ArrayList;

class bankapp3 {
    public static void main(String[] args) {
        indlaan a1 = new indlaan("bente bent", 2.5);
        a1.deposit(100);
        a1.withdraw(50);
        a1.withdraw(100);
        // a1.printTransactions();
        // System.out.println();*/

        hoejrente a2 = new hoejrente("ibbo", 8, 1000, LocalDate.of(2026, 1, 1));
        a2.deposit(100);
        a2.withdraw(500);
        a2.printTransactions();


        ArrayList<Account> list = new ArrayList<>();
        {
            list.add(a1);
            list.add(a2);
            for (Account a : list) {
                a.deposit(100);
                a.annualInterest();
                a.printTransactions();
            }
        }


    }
}

class indlaan extends Account {
    indlaan(String ow, double ir) {
        super(ow, ir);
    }


    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("fejl, du prøver at stjæle. saldo" + balance);
        } else {
            super.withdraw(amount);
            // balance=balance-amount;
            //transaktions.add(new Transaktion("hævet", amount, balance));
        }

    }
}

class hoejrente extends Account {
    LocalDate releaseDate;

    hoejrente(String ow, double ir, double amount, LocalDate date) {
        super(ow, ir);
        releaseDate = date;
        super.deposit(amount);
    }

    public void deposit(double amount) {
        System.out.println("du kan ikke sætte penge ind, taber");
    }

    public void withdraw(double amount) {
        LocalDate today = LocalDate.now();
        if (today.isBefore(releaseDate)) {
            System.out.println("saldoen er lukket indtil " + releaseDate);
        } else {
            super.withdraw(amount);
        }
    }

}


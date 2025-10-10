package RandomOpg;

import java.io.*;
import java.util.ArrayList;

public class studentlist {
    public static void main(String[] args) throws IOException {

        FileReader fil = new FileReader("src//Studentlist.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<String> list = new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null) {
            //System.out.println(linje);
            String[] bidder = linje.split(";");
            String efternavn = bidder[2];
            list.add(efternavn);
            //System.out.println(bidder[0]);
            //System.out.println(bidder[1]);
            //System.out.println(bidder[2]);//"\n");
            //System.out.println(bidder[3]);
            linje = ind.readLine();
        }
        ind.close();
        list.sort(null);
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }

        save(list);


    }


    static void save(ArrayList<String> l) throws IOException {
        FileWriter fil = new FileWriter("src//studentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (String s : l) {
            ud.println(s);
            ud.close();
        }

    }
}

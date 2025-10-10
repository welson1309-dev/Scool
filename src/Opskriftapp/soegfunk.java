package Opskriftapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class soegfunk {
    static ArrayList<String> list=new ArrayList();
        public static void nyOpskrift()throws IOException {
            // Opskrift liste bliver indlæst

            FileReader fil=new FileReader("C:\\bbbiii\\opskrifter.txt");
            BufferedReader ind=new BufferedReader(fil);
            String linje;
            String nyOpskrift="";

            // Looper tilføjer opskrifter fra txt til Arraylist
            while((linje=ind.readLine())!=null){
                if (linje.equals("********")){ // definere slut linje på en opskrift
                    list.add(nyOpskrift);
                    nyOpskrift="";
                }else{
                    nyOpskrift+=linje+"\n";
                }
            }
        }

        // søge metode fungere med Keywords/kategorier
         static public void soeg(String keyword){
            ArrayList<String> matches=new ArrayList<>();// Nye Arraylist indholder opskrifter der matcher med søgning

            for(String key:list){
                if(key.toLowerCase().contains(keyword.toLowerCase())){
                    matches.add(key);
                }
            }// Loop printer alle opskrifte med valgte kategori
            for(String match:matches){
                System.out.println(match+"\n");
            }
        }
    }//class opskrift

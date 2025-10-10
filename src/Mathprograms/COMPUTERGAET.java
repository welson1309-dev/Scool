package Mathprograms;

import javax.swing.*;

public class COMPUTERGAET {
    //static Scanner keyboard = new Scanner(System.in);




    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("giv mig et tal mellem 1 og 100 jeg skal gætte");
        //JOptionPane.showMessageDialog(null,"hehe");

        int brugerstal = Integer.parseInt(input);

        int laveste = 1;
        int hoejeste = 100;
        int gaet;
        int antalgaet = 0;


        while (true){
            gaet = (laveste + hoejeste) / 2;
            antalgaet++;
            System.out.println("mit gaet er " + gaet);
            //JOptionPane.showMessageDialog(null,"mit gaet er " + gaet);


            if(gaet == brugerstal) {
                JOptionPane.showMessageDialog(null,"det tog mig " +antalgaet+ " forsøg at gætte dit tal:)");
                //System.out.println("det tog mig " +antalgaet+ " forsøg at gætte dit tal:)");
                break;

            } else if (gaet > brugerstal) {
                //JOptionPane.showMessageDialog(null,"jeg gættede for højt");
                System.out.println("Jeg gættede for højt :(");
                hoejeste = gaet - 1;


            }else {
                //JOptionPane.showMessageDialog(null,"jeg gættede for lavt");
                System.out.println("jeg gaettede for lavt :(");
                laveste = gaet + 1;
            }
        }


    }

}


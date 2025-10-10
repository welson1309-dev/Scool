package Mathprograms;

public class multiplicationtable {
    public static void main(String[] args) {
        for (int n = 1; n < 11; n++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i*n+ "\t"); // backslasht= formateringstegn
            }
            System.out.println();
        }
    }
}
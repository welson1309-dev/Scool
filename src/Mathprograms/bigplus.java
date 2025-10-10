package Mathprograms;

public class bigplus {
    public static void main(String[] args) {
            int sum = 0;

            for (int i = 1; i <= 20; i++) {
                sum = sum + i;  // Eller sum += i;
                System.out.print(i);
                if (i<20) System.out.print(" + ");

                //System.out.print(i + " + ");
            }
                System.out.print(" = " + sum);

        }
    }


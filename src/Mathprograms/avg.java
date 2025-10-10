package Mathprograms;

public class avg {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int sum=sum(a, b, c, d);
        int avg=(sum/d);
        System.out.println("average="+avg);

    }
    static int sum(int a, int b, int c, int d) {
        int s;
        s = a + b + c + d;
        return s;
    }
}

package RandomOpg;

public class max3method {
    public static void main(String[] args) {
        int a,c,b;
        a=5;
        b=2;
        c=0;
        System.out.println("størst="+max(max(a,b),c));

    }

    static int max(int x, int y) {

        if (x > y)
            return x;
        else return y;
    }
}

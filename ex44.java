// Accept 3 values and find the greatest value

public class ex44 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=2;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        int g=a;
        if ((b>g)) {
            g=b;
        }
        if (c>g) {
            g=c;
        }
        System.out.println("A is greatest val"+g);
    }
}

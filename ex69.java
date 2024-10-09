// Accept a value and find the greatest digit and smallest digits
// eg:-  25793 =>
// greatest =>9
// smallest =>2
import java.util.Scanner;
public class ex69 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  A value");
        int n=sc.nextInt();
        int g=n%10;
        int s=n%10;
        while (n!=0) {
            int r=n%10;
            n=n/10;
            if(g<r)
            g=r;
            if(s>r)
            s=r;
        }
        System.out.println("A gretest  Digits "+g);
        System.out.println("A gretest  Digits "+s);
    }
}

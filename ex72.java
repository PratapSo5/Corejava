/*Accept  a value and check wether it is armstrong value or not
 * eg:- 153 =>1^3+5^3+3^3 =>153
 */
import java.util.*;
public class ex72 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a  value");
        int n= sc.nextInt();
        int t=n;
        double s=0;
        int c=0;
        while (t!=0) {
            c++;
            t=t/10;
        }
        t=n;
        while (n!=0) {
            int r=n%10;
            n=n/10;
            double temp =r;
            s=s+Math.pow( temp,c);
        }
        double t1=t;
        if (s==t1) {
            System.out.println("Armstrong number");
        }
        else
        System.out.print("not armstrong");
    }
}



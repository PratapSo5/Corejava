/*Accept a value and check wether it is prime value or not
 * eg:- n=11 =>when  avalue is not divisible by any number ,except by 1 and itself
 */
import java.util.*;
public class ex73 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a value");
        int n =sc.nextInt();
        int flag=0;
        int i=2;
        while (i<=n/2) {
            if (n%i==0) {
                flag=1;
                break;
            }
            i++;
        }
        if (flag==0) {
            System.out.println("prime value");
        }
        else
        System.out.print("not prime");
    }
}


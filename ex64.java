// Accept a value find the the sum  of digits except LSD
// eg:-2 5 7 9 =>2+5+7 =>14
import java.util.*;
public class ex64 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter a val");
        int n=sc.nextInt();
        int s=0;
        n=n/10;
        while ((n!=0)) {
            s=s+(n%10);
            n=n/10;
        }
        System.out.print("Sum of Digits except LSD= "+s);
    }
    
}

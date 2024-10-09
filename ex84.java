//  1!+5!+9! --------+n terms
import java.util.*;
public class ex84 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of terms");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while (i<=n) {
            int t=4*i-3;
            int j=1;
            int f=1;
            while (t!=0) {
                f=f*t;
                t--;
            }
            s=s+f;
            i++;
        }
        System.out.println("sumof series  = "+s);
    }
}

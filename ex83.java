// 1!+2!+3!_________+n terms
import java.util.*;
public class ex83 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  no.of trems ");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while (i<=n) {
            int t=i;
            int f=1;
            while (t!=0) {
                f=f*i;
                t--;
            }
            s=s+f;
            i++;
        }
        System.out.println("sum of factrioal no  "+s);
    }
}

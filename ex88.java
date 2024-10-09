// (1)+(2+2)+(3+3+)+_________+n terms
import java.util.*;
public class ex88 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of terms");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while (i<=n) {
            int m=0;
            int k=1;
            while (k<=i) {
                m=m+i;
                k++;
            }
            s=s+m;
            i++;
        }
        System.out.println("sum of series "+s);
    }
}

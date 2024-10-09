// (1)+(1+2)+(1+2+3)+__________+n terms
import java.util.*;;
public class ex87 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter no.of terms");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while (i<=n) {
            int m=0;
            int k=1;
            while (k<=i) {
                m=m+k;
                k++;
            }
            s=s+m;
            i=i+1;
        }
        System.out.println("sum of series "+s);
    }
}

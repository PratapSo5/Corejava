// 1^2+2^3+3^5+_______+n terms

import java.util.*;;
public class ex86 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of terms");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while (i<=n) {
            int m=1;
            int k=1;
            while (k<=(2*i-1)) {
                m=m*i;
                k++;
            }
            s=s+m;
            i++;
        }
        System.out.println("Sum of series  "+s);
    }
}

//  1^2+2^2+3^2+______+n terms

import java.util.*;;
public class ex85 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of terms");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while (i<=n) {
            int m=1;
            int k=1;
            while (k<=i) {
                m=m*i;
                k++;
            }
            s=s+m;
            i++;
        }
        System.out.println("sum of series = "+s);
    }
}

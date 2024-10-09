// 1!+3!+5!+_________+n terms

import java.util.*;
public class ex104 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of terms");
        int n=sc.nextInt();
        int s=0;
        for (int i=1; i<=n; i++) {
            int f=1;
            int t=2*i-1;
            while (t!=0) {
                f=f*t;
                t--;
            }
            s=s+f;
        }
        System.out.println("sum of series "+s);
    }
}

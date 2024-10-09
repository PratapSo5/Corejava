/*  Accept 2 values  and find their sum of factrioal values
eg;- n!+m!
*/
import java.util.*;
public class ex91 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a two value");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int f1=1,f2=1;;
        for (int i = 1; i <=n; i++) {
            f1=f1*i;
        }

        for(int i=1;i<=m;i++){
            f2=f2*i;
        }
        System.out.println("sum of two factrioal number "+(f1+f2));
    }

}

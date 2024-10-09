// 100+99+98+__________+n terms
import java.util.*;
public class ex102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of terms ");
        int n=sc.nextInt();
        int s=0;
        for (int i=1; i<=n; i++) {
            s=s+(100-(i-1));
        }
        System.out.println("sum of series "+s);
    }
}

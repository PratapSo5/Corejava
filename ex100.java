//  1+3+5+_________+n terms
import java.util.*;
public class ex100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  no.of terms");
        int n=sc.nextInt();
        int s=0;
        for(int i=1; i<=n; i++){
            s=s+(2*i-1);
        }
        System.out.println("sum of series  "+s);
    }
}

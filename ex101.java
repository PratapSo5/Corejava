//   -1+2-3+4-_______________+n terms
import java.util.*;
public class ex101 {
    public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.println("ENter the no.of terms");
    int n=sc.nextInt();
    int s=0;
    for (int i=1;i<=n; i++) {
        if(i%2==1)
        s=s-i;
        else
        s=s+i;
    }
    System.out.println("sum of series "+s);
    }

}

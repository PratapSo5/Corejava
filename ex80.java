/*sum of series 1+2+3+____________+n terms */
import java.util.*;
public class ex80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the no.of terms");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while (i<=n) {
            s=s+i;
            i++;
        }
        System.out.println("Sum of series = "+s);
    }
}

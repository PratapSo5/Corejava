/*sum of series  1+3+5+ ___ _______+n terms */
import java.util.*;
/**
 * ex81
 */
public class ex81 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter  no.of terms = ");
            int n=sc.nextInt();
            int i=0;
            int s=0;
            while (i<=n) {
                s=s+(2*i+1);
                i++;
            }
            System.out.println("sum of series = "+s);
        }
    }

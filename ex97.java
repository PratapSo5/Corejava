/* Accept a value and reverse  its digits
eg:- n=257  =>752
 */
import java.util.*;
public class ex97 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  a value");
        int n=sc.nextInt();
        int s=0;
        for(;n!=0;)
        {
            int r=n%10;
            n=n/10;
            s=s*10+r;
        }
        System.out.println("Revesrse digits "+s);
    }
}

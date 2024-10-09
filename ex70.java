/* ccept a value and reverse the  digits
eg:-n=257 =>752
formula   s=s*10+r
*/ 
import java.util.*;
public class ex70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int n=sc.nextInt();
        int s=0;
        while (n!=0) {
            int r=n%10;
            n=n/10;
            s=s*10+r;
        }
        System.out.println("After the reversing Digits "+s);

    }
}

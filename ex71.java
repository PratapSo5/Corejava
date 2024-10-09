/*Accept  a value and check whether it, is pellindrom value or not
eg:- 121   after reversing  same value  =>121
 * 
 */
import java.util.*;
public class ex71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int n=sc.nextInt();
        int rev =0,t=n;
        while (n!=0) {
            int r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if (rev==t) {
            System.out.println("pallindrom number");
            
        }
        else
        System.out.print("not pallindrom number");
    }
    
}

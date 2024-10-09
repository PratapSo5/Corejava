/*  Accept a value and find the sum of its digits
   eg:-  n=257  =>2+5+7 =>14 
*/
import java.util.*;
public class ex96 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int n=sc.nextInt();
        int s=0;
        for(;n!=0;){
        int r=n%10;
        n=n/10;
        s=s+r;
        }
        System.out.println("sum of digits  "+s);
    }
}

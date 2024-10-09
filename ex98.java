// Accept a value and check whether  it is armstrong value or not
import java.util.*;
public class ex98 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entera value");
        int n=sc.nextInt();
        int s=0;
        for(int t=n; t!=0;){
            int r=t%10;
            t=t/10;
            s=s+r*r*r;
        }
        if (s==n) 
            System.out.println("Armstrong number ");
        else
        System.out.println("not armstrong  number ");
    }
}

/* Accept a  value and weather it is pefect or not    using while loop
eg;-  n=6
1,2,3 [Except itself]
1+2+3=>6

equivalent i.e. perfect value
*/ 
import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a val");
        int n=sc.nextInt();
        int i=1,s=0;
        while(i<=n/2){
            if(n%i==0)
            s=s+i;
            i=i+1;
        }
        if(s==n)
        System.out.print("perfect number");
        else
        System.out.print("not perfect");
    }
}

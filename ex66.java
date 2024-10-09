// Accept a value and count the total no.of digits in accepted value
// eg;- n=2579 => 4
import java.util.* ;
public class ex66 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a value");
        int n=sc.nextInt();
        int c=0;
        while (n!=0) {
            
            c++;
            n=n/10;

        }
        System.out.println("Total no.of Digits  ="+c);
    }
}

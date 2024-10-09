/*Accept a value and find the sum of digits 
 * 257=> 2+5+7 =>14
*/
import java.util.*;;
public class ex63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter a vaule");
    int n=sc.nextInt();
    int s=0;
    while (n!=0) {
        s=s+(n%10);
        n=n/10;
    }
    System.out.println("Sum of digits  = "+s);
    }
    
}

/*Accept a value and check wether it is prime or not */
import java.util.*;;
public class ex92 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value");
        int n=sc.nextInt();
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if (n%i==0) {
                flag=1;
                break;
            }
        }
        if (flag==0) {
            System.out.println("prime val");
        
        }
        else
        System.out.print("not prime no");
    }
}


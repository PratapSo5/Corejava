// Accept a value and find their factor values
// eg:- 6 => 1,2,3,6
import java.util.*;
public class ex94 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a value");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if (n%i==0) {
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
}

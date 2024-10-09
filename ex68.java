// Accept a value  and find the greatest digit
// eg:- 2  5 7  9 3 => 9
 import java.util.*;
public class ex68 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        int g=n%10;
        while (n!=0) {
            int r=n%10;
            n=n/10;
            if (g<r) {
                g=r;
            }
        }
        System.out.println(" A is greatest number "+g);
    }
}

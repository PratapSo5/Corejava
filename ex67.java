// Accept a value and count the total no.of odd digits
// eg:- 24743  => 2

import java.util.Scanner;

public class ex67 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  avalue");
        int n=sc.nextInt();
        int c=0;
        while (n!=0) {
            int r=n%10;
            n=n/10;
            if (r%2==1) 
            c++;
        }
        System.out.println("Total no.of odd digits  = "+c);
    }
}

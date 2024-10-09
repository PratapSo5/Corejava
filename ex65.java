// Accept a value and find  the sumof digits except MSD

import java.util.*;
public class ex65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int n= sc.nextInt();
        int s=0;
        int r=0;
        while (n!=0) {
            r=n%10;
            s=s+r;
            n=n/10;
            
        }
        s=s-r;
        System.out.println("Sum of digits except MSD "+s);

    }
}

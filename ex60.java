// Accept  a value and find the factorial value  using while loop 

import java.util.Scanner;

public class ex60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int n =sc.nextInt();
        int f=1;
        while (n!=0) {
            f=f*n;
            n=n-1;
        }
        System.out.println("factorial val= "+f);
    }
}

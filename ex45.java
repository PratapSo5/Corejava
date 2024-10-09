
// Accept 5 values and find the smallest value

import java.util.Scanner;
public class ex45 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  5 value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int g=a;
        if(b<g)
        b=g;
        if(c<g)
        c=g;
        if(d<g)
        d=g;
        if(e<g)
        g=e;
        System.out.println("smallest number is"+g);
    }
        
}


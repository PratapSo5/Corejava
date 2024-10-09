// WAP for finding the greatest value b/w  3 accepted values without using  if-else statement

import java.util.Scanner;

public class ex39 {
    int  a,b,c;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println(("enter the value of A"));
        int a=sc.nextInt();
        System.out.println(("enter the value of b"));
        int b=sc.nextInt();
        System.out.println(("enter the value of c"));
        int c=sc.nextInt();
        
        int g=(a>b)?a:b;
        g=(g>c)?g:c;
        System.out.println(g);
    }
    public static void main(String args[]){
        ex39 x=new ex39();
        x.input();
    }
}

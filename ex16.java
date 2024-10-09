// Accept Principle ammount  time and rate then find the simple  interest(time will be in year)

import java.util.Scanner;

public class ex16 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rate ");
        int R=sc.nextInt();
        System.out.println("enter  a time ");
        int t=sc.nextInt();
        System.out.println("Enter a Princple");
        int p=sc.nextInt();
        double si=(p*R*t/12)/100;
        System.out.println("Simple Interset:"+si);
    }
    
}

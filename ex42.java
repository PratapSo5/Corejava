

import java.util.Scanner;

// Accept  a value for  no.of days then, find the rottal of years  weeks ,months and rest of the days
public class ex42 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a value  for no.of days  ")
        int d=sc.nextInt();
        int y=d/365;
        int m=(d%365)/30;
        int w=((d%365)%30)/7;
        d=((d%365)%30)%7;
        System.out.println("no.of yeras  ="+y);
        System.out.println("no.of months  ="+m);
        System.out.println("no.of weeks  ="+w);
        System.out.println("no.of Days  ="+d);
    }
}

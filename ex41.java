

import java.util.Scanner;

// Accept values for years  ,months and hours
public class ex41 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(("Enter the values of Years"));
        int y=sc.nextInt();
        System.out.println(("Enter the values of Months"));
        int m=sc.nextInt();
        System.out.println(("Enter the values of Weeks"));
        int w=sc.nextInt();
        int days =y*365+m*30+w*7;
        System.out.println("totals days="+ days);

    }
}

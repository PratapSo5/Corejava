// Accept a value and genrate their table using while loop

import java.util.Scanner;

public class ex59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i=1;
        while (i<=10) {
            System.out.println(i*n);
            i++;
        }
    }
}

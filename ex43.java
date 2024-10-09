
// find greatest value  using if condition

import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("A is greatest value "+a);
        }
        if(a<b){
            System.out.println("B is greater value"+b);
        }

    }
}

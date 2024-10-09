//  Accept 5 array values and display this values

import java.util.Scanner;

public class ex124 {
    public static void main(String[] args) {
        int s=5;
        int a[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<s;i++){
            System.out.println("Enter  a value");
            a[i]=sc.nextInt();
        }
        System.out.println(("my accepted value  "));
        for(int i=0;i<s;i++){
            System.out.println(a[i]+ "\t");
        }
    }
}



import java.util.Scanner;

// Accept  a value and check wether  it is  odd or even value
public class ex46 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println(("Enter a value"));
        int a=sc.nextInt();
        if(a%2==0)
        System.out.println("A is even number");
        if(a%2!=0)  
        System.out.print("A is odd no ");
    }
}

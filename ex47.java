

import java.util.Scanner;

// Accept the value  if 1st value is greater  than 2nd value  then find te sum of sq of values
public class ex47 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println(("Enter the value of a"));
        int a=sc.nextInt();
        System.out.println(("Enter the value of a"));
        int b=sc.nextInt();
        if(a>b){
        System.out.println("A is greater value  "+((a*a)+(b*b)));
        }
        
    }
}

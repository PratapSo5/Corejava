// Accept two values and perform arithmetic operation

import java.util.Scanner;

public class ex27 {
    int a,b;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of  A");
        a=sc.nextInt();
        System.out.println("Enter a value of  B");
        b=sc.nextInt();

    }
    void display(){
        int c=a+b;
        System.out.println("Sum of Two Number:-"+c);
        c= a-b;
        System.out.println("Subtraction of Two number:-"+c);
        c= a*b;
        System.out.println("Multiplicationof Two number:-"+c);
        c= a/b;
        System.out.println("Divsion of Two number:-"+c);

    }
    public static void main(String[] args) {
        ex27 x=new ex27();
        x.input();
        x.display();
    }
}

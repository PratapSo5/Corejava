// Accept 2 values and perform arithmetic operations .But Selected iperation to be performed

import java.util.Scanner;

public class ex28 {
    int a,b;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of A:");
        a=sc.nextInt();
        System.out.println("Enter a value of b:");
        b=sc.nextInt();
    }
    void add(){
        int add=a+b;
        System.out.println("Some of two number:"+add);
    }
    void sub(){
        int sub=a-b;
        System.out.println("Subtraction of Two Number:"+sub);
    }
    void multi(){
        int mul=a*b;
        System.out.println("Multiplication of  Two Number:"+mul);
    }
    void div(){
        int div=a/b;
        System.out.println("Divsion of Two Number:"+div);
    }
    void rem(){
        int rem=a%b;
        System.out.println("Remander of Two Number:"+rem);
    }
    public static void main(String args[]){
        ex28 x=new ex28();
        x.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any choice:");
        System.out.println("Enter 1 for Add");
        System.out.println("Enter 2 for Sub");
        System.out.println("Enter 3 for Multi");
        System.out.println("Enter 4 for Divsion");
        System.out.println("Enter 5 for  Remamder");
        int c= sc.nextInt();

        if(c==1)
        x.add();
        if(c==2)
        x.sub();
        if(c==3)
        x.multi();
        if(c==4)
        x.div();
        if(c==5)
        x.rem();
        if(c>5)
        System.out.println("Wrong Choice");

    }
}

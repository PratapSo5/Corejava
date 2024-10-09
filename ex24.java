// WAP foe accepting  value for instance variable and then display
import java.util.Scanner;

public class ex24 {
    int a;
    double b;
    String c;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  A integer:-");
        a=sc.nextInt();
        System.out.println("Enter  A double:-");
        b=sc.nextFloat();
        System.out.println("Enter  A String");
        c=sc.next();
    }

    void display(){
        System.out.println("integer:-"+a);
        System.out.println("Double:-"+b);
        System.out.println("String:-"+c);
    }

    public static void main(String args[]){
        ex24 x= new ex24();
        
        x.input();
        x.display();
    }
    
}

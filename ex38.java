
//  write  a  program for finding  the greateast  value between 2 accepted values without using  if-else statement
import java.util.Scanner;
public class ex38 {
    int a;
    int b;
    
    void largest(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of A");
    int a=sc.nextInt();
    System.out.println("enter the value of B");
    int b=sc.nextInt();
    
        int  g=(a>b)?(a):(b);
        System.out.print(g);
    }
    public static void main(String args[]){
    

    
        ex38 x=new ex38();
        x.largest();

}
}

/*  another approach
import java.util.Scanner;
class Ex38{
    int a,b;
    void input(int i ,int j){
        a=i;
        b=j;
    }
    void display(){
        int g=(a>b)?a:b;
        System.out.println(g);
    }


public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.printlin("enter two value ");
    int p=sc.nextInt();
    int q=sc.nextInt();
    Ex38 x=new Ex38();
    x.input(p,q);
    x.display();

}
}
*/
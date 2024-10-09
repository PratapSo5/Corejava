

import java.util.Scanner;
import java.util.*;

//*acept  two values  for the instace  varible and then return sum of sqaure  of values/
public class ex34 {
    int  a,b;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two value of A& B");
        a=sc.nextInt();
        b=sc.nextInt();
    } int result(){
        int s;
        s=(a*a)+(b*b);
        return s;
    }
    public static void main(String args[]){
        ex34   x=  new ex34();
        x.input(); 
        int r=x.result();
        System.out.print("sum  of square of two values"+ r);
    }
    
}

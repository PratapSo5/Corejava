
//  write a programe  for copying  one object  to another object
import java.util.*;
public class ex35 {
    int a ;
    double b;
    
    void input (){
        a=10;
        b=2.5;
    }
    void display(){
        System.out.print("a="+a);
        System.out.print("b="+b);
    }
    void copy(ex35 t){
        a=t.a;
        b=t.b;
    }
    public static void  main(String args[]){
        ex35 x,y;
        x= new ex35();
        y= new ex35();
        x.input();
        y.copy(x);

        System.out.print("my accept value for objects x");
        x.display();
        System.out.print("after copying  from  x to y");
        y.display();
    }
}

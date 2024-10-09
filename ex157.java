// wroking with super keywrod for  parameterized consturctor

import java.util.*;
import java.util.Scanner;

public class ex157 {
    double b;
    public  ex157(double i){
        b=i;
    }
    public static void main(String[] args) {
        child x=new child(2.3d, 3.7d);
        x.display();
    }
}

class  child extends ex157  {

    double b;
    public child (double a , double c){
        super(a);
        b=c;
    }
    public void display(){
        System.out.println("base m= "+super.b);
        System.out.println("child  n= "+b);
    }
    
}
// Accept radius of the circle and pass it as argument to the method for the instance  variable  then find the area of the circle  

import java.util.Scanner;

public class ex32 {
    double r;
    void input(double i){

        r=i;
    }
    void display(){
        double b=3.14*r*r;
        System.out.println("are of cricle"+b);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ex32 x=new ex32();
        System.out.println("enter value of radius");
        double r=sc.nextDouble();
        x.input(r);
        x.display();
    }
}

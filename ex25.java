// Accepting radius the corcle then  find the area of the circle

import java.util.Scanner;

public class ex25 {
    double radius;
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  radius");
        radius=sc.nextFloat();
        
    }
    void output(){
        double ar=3.14*radius*radius;
        System.out.println("radius of  cricle:-"+ar);
    }
    public static void main(String[] args) {
        ex25 x=new ex25();
        x.display();
        x.output();
    }
}

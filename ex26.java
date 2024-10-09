// Finding area of the two different circle by accepting 2 radiusof the circle

import java.util.Scanner;

public class ex26 {
    double rad;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius of cricle");
        rad= sc.nextDouble();
    }
    void display(){
        double arr=3.14*rad*rad;
        System.out.println("Cricle of radius"+arr);
    }
    public static void main(String[] args) {
        ex26 x,y;
        x=new ex26();
        y=new ex26();
        x.input();
        y.input();
        System.out.println("1st cricle");
        x.display();
        System.out.println("2st cricle");
        y.display();
    }
}

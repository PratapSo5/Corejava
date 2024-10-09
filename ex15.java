// Accept radius of the circle and find the radius

import java.util.Scanner;

public class ex15 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius of cricle:");
        int r=sc.nextInt();
    double area=3.14*Math.pow(2, r);
        // double area=3.14*r*r;
        System.out.println("area of cricle: "+area);
    }
    
}

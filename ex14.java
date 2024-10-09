// Accepting Length and width of the rectangle then find the area

import java.util.Scanner;

public class ex14 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  the  rectangle of  lenght");
        int l=sc.nextInt();
        System.out.println("Enter the  rectangle of height");
        int w=sc.nextInt();
        int arect=l*w;
        System.out.println("area of rectangle:"+arect);
    } 
    
}

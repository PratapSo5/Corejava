//  working with character value by accepting

import java.util.Scanner;

public class ex12 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String Name=sc.nextLine();
        System.out.println("Enter a  Roll Number");
        int Rollno=sc.nextInt();
        System.out.println("Enter  your marks");
        float Marks=sc.nextFloat();
        System.out.println("Enter  your marks");
        float Avmarks=sc.nextFloat();
        System.out.println("Enter your Gender:Male/Female");
        String Gender=sc.nextLine();

        System.out.println("Nmae"+Name);
        System.out.println("Rollno"+Rollno);
        System.out.println("Marks"+Marks);
        System.out.println("Avg"+Avmarks);
        System.out.println("gender"+Gender);

    }
    
}

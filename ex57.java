/*  print designation an employee respect to  their salary
salary          Designation
10k-15k         peon
15k-20k         electrician
20k-25k         lab Technician
25k-30k         Engineer
30k-40k         Manager
*/

import java.util.Scanner;

public class ex57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Salary");
        int s=sc.nextInt();
        if (s>10000 &&  s<15000) {
            System.out.println("Peon");  
        }
        else if (s>15000 && s<20000) {
            System.out.println("Electrican");
        }
        else if (s>20000 && s<25000) {
            System.out.println("Lab technician");
        }
        else if (s>25000 && s<30000) {
            System.out.println("Engineer");
        }
        else if (s>30000 && s<40000) {
            System.out.println("Electrican");
        }
        else
        System.out.print("Salary does not Exist");

    }
}

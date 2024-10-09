

/*Accept Student information Like :-
|.> Name of the Student 
||.> RollNo
|||.>Total Marks
|V.>Average Marks w.r.t  5 Subjects
V.> Gender

 */

import  java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Students  Name:");
        String name=sc.next();
        
        System.out.println("Enter RollNo");
        int RollNo=sc.nextInt();

        System.out.println("Enter the totals Marks:");
        double mark=sc.nextDouble();
        double avg=mark/5;
        
        System.out.println("\n");

    

        System.out.println("RollNo: "+RollNo);
        System.out.println("Total Marks: "+mark);
        System.out.println("Average Marks: "+avg);
        
}
}

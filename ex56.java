/*print grade for a marks which is  obtained by a student in the exam
marks                 grade
90 and above          outstanding
80-90                 Excllent
70-80                 very good
60-70                 good
<60                   fail
*/

import java.util.*;
public class ex56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Marks");
        int m=sc.nextInt();
        if(m>=90)
        System.out.print("outstanding");
        else if (m>=80 && m<90) {
            System.out.println("Excllent");
        }
        else if (m>=70 && m<80) {
            System.out.println("very good");
        }
        else if(m>=60 && m<70)
        System.out.print("Good");
        else
        System.out.print("fail");
    }
}

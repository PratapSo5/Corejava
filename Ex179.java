// working with finally block
import java.io.IOException;
import java.util.*;
public class Ex179 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a marks for a subject");
        try{
            int m=sc.nextInt();
            if (m<=100) {
                System.out.println("My accepted  valid  marks is  "+m);
            }
            else
            throw new IOException();
        }catch(IOException e){
            System.out.println("your accepted marks is out of range");
        }
        finally{
            System.out.println("This is finally  block and always participate in execution  eitger existing of error or not");
        }
    }
}

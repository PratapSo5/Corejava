// working with throw clause[Exception will be rasied when user accepts marks out of range]
import java.io.IOException;
import java.util.*;

public class Ex178 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a marks  for a subjects");
        try{
            int m=sc.nextInt();
            if (m<=100) {
                System.out.println("my accepted valid marks "+m);
            }
            else
                throw new IOException();
        }catch(IOException e){
            System.out.println("your accepted  marks is out of range");
        }
    }
}
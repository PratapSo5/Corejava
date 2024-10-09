// Accept a character value and display it
import java.io.*;
public class ex121 {
    public static void main(String[] args) {
        try{
            System.out.println("Enter a charcter value = ");
            char ch=(char)System.in.read();
            System.out.println("My  accepted value "+ch);
        }catch(Exception e ){}
    }
}

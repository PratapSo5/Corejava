// Accept  your name and display it
import java.io.*;
public class ex122 {
    public static void main(String[] args) {
        try{
            StringBuffer name=new StringBuffer();
            char ch;
            System.out.println("Enter your name ");
            while ((ch=(char)System.in.read())!='\n') {
                name.append(ch);
            }
            System.out.println("my accepted value "+name);
        }catch(Exception e){}
    }
}

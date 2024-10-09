// Accepting a double data type value anddisplay it

import java.io.*;;
public class ex120 {
    public static void main(String[] args) {
        try{
            DataInputStream inn = new DataInputStream(System.in);
            System.out.println("Enter a float value ");
            double a=Double.parseDouble(inn.readLine());
            System.out.println(" my accepted value  = "+a);

        }catch(Exception e){}
    }
}

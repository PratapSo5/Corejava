// Acccepting technique for accepting the integer value

import java.io.DataInputStream;
public class ex119 {
    public static void main(String[] args) {
        try{
            DataInputStream inn =new DataInputStream(System.in);
            System.out.println("Enter a integer value ");
            int n=Integer.parseInt(inn.readLine());
            System.out.println("my accepted val "+n);
        }catch(Exception e){

        }
    }
}

// working with Write().[Writing data inyo the file]
import java.io.*;
public class Ex183 {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("f2.txt");
            f.write("Hello this is my 1st file with contents");
            f.close();
            System.out.println("my data writing operation is sucessfully completed");
            
        }catch(IOException e){
            System.out.println("Unexpected erroris raised");
        }
    }
}

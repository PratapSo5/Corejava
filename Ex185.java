// Wroking with delete(). [Deleting existing file]
import java.io.*;
import java.io.File;
public class Ex185 {
    public static void main(String[] args) {
        
            File f=new File("f2.txt");
            if(f.delete()){
                System.out.println("The File "+f.getName()+"is sucessfully deleted");
            }
            else{
            System.out.println("The file  does not exist");
            }
     
    }
}

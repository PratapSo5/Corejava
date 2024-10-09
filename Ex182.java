// working with create NewFile()
import java.io.*;
public class Ex182 {
    public static void main(String[] args) {
        try{
            File f=new File("f1.txt");
            if(f.createNewFile()){
                System.out.println("A file name "+f.getName()+"is created");
            }
            else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("Unexpected error is rasied");
        }
    }
}

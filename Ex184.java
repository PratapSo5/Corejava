// working with read(). [Reading data form the file]
// import java.io.*;
// public class Ex184 {
//     public static void main(String[] args) {
//         try{
//             FileReader f=new FileReader("f2.txt");
//             int d;
//             while ((d=f.read())!=-1) {
//                 System.out.println((char)d);
//             }
//             f.close();
//         }catch(IOException e){
//             System.out.println("Reading operation is failed due to some problem");
//         }
//     }
// }
/*----------another method----------- */

import java.io.*;
public class Ex184 {

    public static void main(String[] args) {
        try{
            InputStream f=new FileInputStream("f2.txt") ;
            Reader r=new InputStreamReader(f);
            int d;
            while((d=r.read())!=-1){
                System.out.println((char)d);
            }
            f.close();
            
        }catch(IOException e){
            System.out.println("Reading operation is failed due to some problem");
        }
    }
}
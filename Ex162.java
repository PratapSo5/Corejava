// wroking with interface
interface Car{
    void run();
}
class maryti implements Car{
   public void run(){
        System.out.println("manx spped 180");
    }
}
class BMW implements Car{
    public void run(){
         System.out.println("manx spped 180");
     }
 }
public class Ex162 {
    public static void main(String[] args) {
        maryti x=new maryti();
        BMW y=new BMW();
        x.run();
        y.run();
            
        
    }
}

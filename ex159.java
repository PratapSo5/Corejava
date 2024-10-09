// another method to write  data abstraction using abstraction  class
abstract class Car{
    public abstract void run();
}
class maryti extends Car{
    @Override
    public void run(){
        System.out.println("maryti car top speed will be 140km/h");
    }
}
class BMW extends Car{
    @Override
 public void run(){
    System.out.println("BMW car top speed will be 250km/h");
}

}
public class ex159 {
    public static void main(String[] args) {
        maryti x=new maryti();
        BMW  y=new BMW();
        x.run();
        y.run();
    }
}

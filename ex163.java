// wroking with extending interface
interface  a{
    void display1();
}
interface  b extends a{
    void display2();
}
public class ex163 implements b {
    public void  display1(){
        System.out.println("A");
    }
    public void display2(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        ex163 x=new ex163();
        x.display1();
        x.display2();
    }
}

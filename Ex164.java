// wroking with more than one interface
interface A{
    void display1();
}
interface B{
    void display2(); 
}
public class Ex164 implements  A,B{
    public void display1(){
        System.out.println("A");
    }
    public void display2(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        Ex164 x= new Ex164();
        x.display1();
        x.display2();
    }
}

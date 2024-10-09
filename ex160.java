// wroking with interface
interface A{
    void display();

}
public class ex160 implements A {
    public void display(){
        System.out.println("this is abstract  mdthod");
    }
    public static void main(String[] args) {
        ex160 x= new ex160();
        x.display();
    }
    
}
// wroking with static  variable respect to multiple objects
public class ex149 {
    static int s;
    void display(){
        System.out.println("value of  s = "+s);
    } 
    public static void main(String[] args) {
        ex149 x= new ex149();
        ex149 z= new ex149();
        ex149 y= new ex149();
        x.display();
        y.display();
        z.display();
        y.s=100;
        System.out.println("After changin g value of  staic variable");
        x.display();
        y.display();
        z.display();
    }
}


//  z=a+b, where z,a&b are the object of the same class 
public class ex36 {
    int a;
    float b;
    void input(int i,float j){
        a=i;
        b=j; 
    }
    void display(){
        System.out.print("a="+a);
        System.out.print("b="+b);
    }
    void sum(ex36  t1, ex36  t2){
        
        a= (int)t1.a +(int) t2.b;
        b=t1.b+t2.a;
    }
    public static void main(String args[])
    {
        ex36  a,b,z;
        a= new ex36();
        b= new ex36();
        z= new ex36();
        a.input(2,2.5f);
        a.input(3,3.5f);
        z.sum(a,b);
        System.out.println(("value wrt to a"));
        a.display();
        System.out.println(("value wrt to a"));
        b.display();
        System.out.println("afere adding (a+b)");
        z.display();
        

    }
}

// W.A.P for achieving 100% data abstraction using abstract class
abstract class  AB {

    public abstract  void display();
}

public class ex158 extends AB {
    // @Override
     public void display(){
        System.out.println("this is  method defination of abstart method");
    }
    public static void main(String[] args) {
        ex158 x=new ex158();
        x.display();
    }
            

}



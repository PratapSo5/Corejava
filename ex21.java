// Working with instance variable

public class ex21 {
    int n;
    double  m;
    void input(){
        n =100;
        m =120.3d;
    }
    void display(){
        System.out.println("value of n:"+n);
        System.out.println("value of m:"+m);

    }

    public static void main(String args[]){
        ex21 x=new ex21();
        x.input();
        x.display();
        
    }
    
}


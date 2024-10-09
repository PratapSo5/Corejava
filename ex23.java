// wprking with multiple objects for the instance variable

public class ex23 {
    int a;
    double b;
    void input(){
        a =23;
        b=34.5;
    }
    void display(){
        System.out.println("integers"+a);
        System.out.println("Doubble"+b);
        

    }
    public static void main(String args[]){
        ex23 x=new ex23();
        ex23 y=new ex23();
        x.input();
        y.input();
        x.display();
        y.display();
    }
    
}

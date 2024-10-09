/*wroking with super keywrod */
 public class ex155{
    int n;
    void input(){
        n=200;
    }
}
class child extends ex155{
    int n;
    void input(){
        super.n=100;
        super.input();
    }
    void display(){
        System.out.println("base value ="+super.n);
        System.out.println("child value ="+super.n);
    }
    public static void main(String[] args) {
        child x=new child();
        x.input();
        x.display();
    }
}
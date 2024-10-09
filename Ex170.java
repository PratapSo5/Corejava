// wroking with  "this"  keyword.
public class Ex170 {
    int n;
    void input(){
        this.n=100;
    }
    void display(){
        System.out.println("value of n="+this.n);
    }
    public static void main(String[] args) {
        Ex170 x=new Ex170();
        x.input();
        x.display();
    }
}

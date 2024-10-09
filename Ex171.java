// wroking with "this" keywrod for differentiating local and instance variables

public class Ex171 {
    int n;
    void input(int n){
        this.n=n;
    }
    void display(){
        System.out.println("val.of n="+ this.n);
    }
    public static void main(String[] args) {
        Ex171 x=new Ex171();
        x.input(100);
        x.display();
    }
}

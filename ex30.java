// passing 2 values as argument to themethod for the instance variable and then display

public class ex30 {
    int a,b;
    void input( int i,int j)
    {
        a=i;
        b=j;

    }
    void display(){
        System.out.println("Value of A:-"+a);
        System.out.println("Value of B:-"+b);
    }
    public static void main(String[] args) {
        ex30 x=new ex30();
        x.input(20, 56);
        x.display();
    }

}

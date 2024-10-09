// Finding greataest value  among 3 given value using nested if -else statement
public class ex52 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=5;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        int g=a;
        if(a>b){
            if(a>c)
            g=a;
            else
            g=c;
        }
        else{
            if(b>c)
            g=b;
            else
            g=c;
        }
        System.out.println((" greatest val is ="+g));
    }
}

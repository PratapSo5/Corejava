// working with try-catch block  w.r.to Arithmetic exception  class
// (The classess of the exception handling are associated with the java.lang package)
public class Ex172 {
    public static void main(String[] args) {
        try{
            int a=5;
            int b=0;
            int c=5;
            System.out.println("a="+a+"\nc="+c);
            System.out.println("a/c="+(a/c));
            System.out.println("a/b="+(a/b));
            System.out.println("thank you");
        } catch( ArithmeticException e){
            System.out.println("error due to division");
        }
    }
}



/*  Accept two value  it 1st value is smaller  then 2nd value find the
  sum of square values  otherwise  square of the sum of value */
import java.util.Scanner;
public class ex49 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println(("Enter the value of A "));
        int a=sc.nextInt();
        System.out.println(("Enter the value of  B"));
        int b=sc.nextInt();
        if(a<b){
            int s=(a*a)+(b*b);
            System.out.println("sum of square  "+s);
        }
        else
        {
        int s=(a+b)*(a+b);
        System.out.print("square of sum of value  "+s );
        }
    }
}


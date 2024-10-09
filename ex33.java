



//*pass  a value  as an argument to the method for returning  a square value */
import java.util.*;
public class ex33 {
    int square (int a)
    {
        return(a*a);
        
    }
    public static void main(String args[]) {
        // Scanner sc= new scanner(System.in);
        int n=10;
        System.out.println("enter the value of n="+n);
        ex33 x=new ex33();
        
        System.out.println("A square value = "+ x.square(n));
    }
}

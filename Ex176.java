// working with throws  clause w.r.to  NumberFormate Exception class
import java.util.*;
public class Ex176 {
    public static void main(String[] args)throws NumberFormatException {
        String s="hello";
        System.out.println("s="+s);
        int n=Integer.parseInt(s);
        System.out.println("n="+n);
    }
}

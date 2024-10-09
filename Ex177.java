// working with throws clause w.r.to nullPointerExcwption class
import java.util.*;
public class Ex177 {
    public static void main(String[] args)throws NullPointerException {
        String s=null;
        System.out.println("s="+s);
        System.out.println("val.of 0th index ="+s.charAt(0));
    }
}

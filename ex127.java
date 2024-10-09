// wroking with  array list
import java.util.*;
public class ex127 {
    public static void main(String[] args) {
        ArrayList<String>obj=new ArrayList<>();
        obj.add("hello");
        obj.add("welcome");
        obj.add("bye");
        System.out.println(obj);
        obj.remove(1);
        System.out.println(obj);
    }
}

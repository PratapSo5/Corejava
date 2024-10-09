// wroking with vector

import java.util.Enumeration;
import java.util.Vector;

public class ex128 {
    public static void main(String[] args) {
        Vector<String>obj=new Vector<String>(2);
        obj.addElement("Hello");
        obj.addElement("Welcome");
        System.out.println("The capacity of obj "+obj.capacity());
        System.out.println("The Size of obj "+obj.size());
        obj.addElement("Bye");
        System.out.println("After adding new  element ");
        System.out.println("Capacity of the obj = "+obj.capacity());
        System.out.println("Size of the obj = "+obj.size());
        Enumeration en=obj.elements();
        System.out.println("Elements are ");
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

    }
}

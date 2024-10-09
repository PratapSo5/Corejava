// wroking with super keywrod for constructor
import java.util.*;

class  ex156{
    public  ex156(){
        System.out.println("Base class");
    }
}
class  child extends ex156{
    public child(){
        super();
        System.out.println("child class");
    }
    public static void main(String[] args) {
        new child();
    }
}
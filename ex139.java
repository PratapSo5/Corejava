// wroking with  Setlength() and setCharAt()
public class ex139 {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("Hello");
        System.out.println("String val "+obj);
        System.out.println("Length "+obj.length());
        obj.setLength(2);
        System.out.println("String  value "+obj);
        obj.setCharAt(1, 'i');
        System.out.println("String  value "+obj );
    }
}

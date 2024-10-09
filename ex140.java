// wroking with insert(),reverse() , and delete()
public class ex140 {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("Hello");
        System.out.println(obj);
        obj.append("Welcome");
        System.out.println(obj);
        obj.insert(6, "****");
        System.out.println(obj);
        obj.reverse();
        System.out.println(obj);
        obj.reverse();
        obj.delete(0, 5);
        System.out.println(obj);
    }
}

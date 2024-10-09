// W.A.P for == operator
public class ex134 {
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2=new String("Hello");
        System.out.println("1st string "+s1);
        System.out.println("2nd string "+s2);
        if (s1==s1) {
            System.out.println("Both objects are same w.r.to same object");
        }
        else
        System.out.println("Both  objects are not same w.r.to same object ");

        if (s1==s2) {
            System.out.println("Both objects are  same w.r.to  diffirent objects");

        }
        else
        System.out.println("Both objects  are not  same  w.r.to different  objects ");
    }
}

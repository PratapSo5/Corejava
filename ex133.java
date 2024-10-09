// W.A.P  for equals()  and equalsIgnoreCase()  methods
public class ex133 {
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2=new String("hello");
        System.out.println("1st sting "+s1);
        System.out.println("2nd sting "+s2);
        if (s1.equals(s2)) {
            System.out.println("Both strins are equals w.r.to equals()");
        }
        else
            System.out.println(" Both strings are not equals w.r.to equals()");

         if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Both are same w.r.to  equalIgnoreCase()");
         } else {
            System.out.println("both are not same w.r.to equalsIgnoreCase()");
         }   

    }
}

// wroking with substring() and concat()
public class ex131 {
    public static void main(String[] args) {
        String s1=new String("Hello");
        System.out.println(" String value "+s1);
        String sb1=s1.substring(2);
        String sb2=s1.substring(0,3);
        String sb3=s1.concat("welcome");
        System.out.println("substring 1 "+sb1);
        System.out.println("substring 2 "+sb2);
        System.out.println("after concating  "+sb3);
    }
}

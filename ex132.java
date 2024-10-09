// wroking with to charArray()
public class ex132 {
    public static void main(String[] args) {
        String s1=new String("Hello");
        System.out.println(" String value "+s1);
        char ch[]=s1.toCharArray();
        System.out.println("Acessing charcter by charcater ");
        for(int i=0;i<s1.length();i++){
            System.out.println(ch[i]);
        }
    }
}

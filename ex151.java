// wroking bwith static method
public class ex151 {
    static int s;
    void input()
{
    s=100;
}
 static void display(){
    System.out.println("value of s = "+s);
 }
 public static void main(String[] args) {
    ex151 x=new ex151();
    x.input();
    x.display();
 }
}

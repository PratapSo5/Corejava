// wroking with static method in another class
public class ex152 {
    static int   s;
     void input(){
        s=100;
     }
     static void  display(){
        System.out.println("value of  s= "+s);
     }
}
 class  call {
    public static void main(String[] args) {
        ex152 x =new ex152();
        x.input();
        ex152.display();    
    }
 }

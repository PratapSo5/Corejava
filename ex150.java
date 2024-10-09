// wroking with static variuable  in nanother class
public class ex150 {
    static int s;
}
class call{
    public static void main(String[] args) {
        new ex150();
        System.out.println("value of s = "+ex150.s);
        ex150.s=100;
    System.out.println("value of s after changing  the value  "+ex150.s);
    }
}

// wroking with static variabler

public class ex148 {
    static int s;
    void display(){
        System.out.println("value of s = "+s);
    }
    public static void main(String[] args) {
        ex148 x= new ex148();
        x.display();
    }
}

/*another approach
 * 
 * claas ex148 {
 * static  int s=100;
 * public static void main(String args[]){
 * new ex148();
 * System.out.println("value of s = "+s)
 * }
 * }
 */

/*anopther approach
 * 
 * class ex148{
 * public static void main(String args[]){
 * static  int s=100;
 * System.out.println("value of s = "+s);
 * }
 * }
 */
/*genrate factor values for 10 to 30
 * eg:- 10 => 1,2,5,10
 *      11 =>1.11
        `
        `
        `
        30 => 1,2,5,6,10,15,30
 */
import java.util.*;
public class ex95 {
    public static void main(String[] args) {
        System.out.println("factor values  for  10 to 30: ");
        for(int i=10;i<=30;i++){
           System.out.println(i+",");
           for(int j=1; j<=i/2;j++){
            if (i%j==0) 
                System.out.print(j+",");
           }
           System.out.println(i);
        }
    }
}

/*print the pattern
   4 3 2 1
   3 2 1 
   2 1
   1
 */
import java.util.*;
public class ex109 {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

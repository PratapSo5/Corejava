/* print the pattern
   4
   3 3
   2 2 2
   1 1 1 1

 */
import java.util.*;
public class ex108 {
    public static void main(String[] args) {
        for (int i=4; i>=1; i--) {
            for (int j=i; j<=4; j++) {
                System.out.print(i+  " ");
            }
            System.out.println();
        }
    }
}

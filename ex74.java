/* print the pattern
    *
    **
    ***
    ****
    *****
 */
import  java.util.*;
public class ex74 {
    public static void main(String[] args) {
        int i=1;
        while (i<=5) {
            int j=1;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++; 
        }
    }
}

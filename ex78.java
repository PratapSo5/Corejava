/*print the print
   *
   * *
   * * *
   * * * *
   * * *
   * *
   * 
 */
import java.util.*;
public class ex78 {
    public static void main(String[] args) {
        int i=1;
        while (i<=7) {
            if (i<=4) {
                int j=1;
                while (j<=i) {
                    System.out.print("*_");
                    j++;
                }
            }
            else {
                int j=7;
                while (j>=i) {
                    System.out.print("*_");
                    j--;
                }
            }
            System.out.println();
            i++;
        }
    }
}

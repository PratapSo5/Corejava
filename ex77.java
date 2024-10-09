/*print the pattern
 1
 1  3
 1  3 5
 1  3 5 7
 */
import java.util.*;;
public class ex77 {
    public static void main(String[] args) {
        int i=1;
        while (i<=4) {
            int j=1;
            while (j<=i) {
                System.out.print((2*j-1)+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

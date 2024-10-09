/*print the print
   1
   2   3
   4   5  6
   7   8  9  10
 */import java.util.*;;
public class ex76 {
    public static void main(String[] args) {
        int i=1, t=1;
        while (i<=4) {
            int  j=1;
            while (j<=i) {
                System.out.print(t+ "\t");
                j++;
                t++;
            }
            System.out.println();
            i++;
        }
    }
}

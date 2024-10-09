/*
   * * * *
   * * *
   * *
   * 
   * *
   * * *
   * * * *
 */
import java.util.*;
public class ex79 {
    public static void main(String[] args) {
        int i=1;
        while (i<=7) {
            if (i<=4) {
                int j=4;
                while (j>=i) {
                    System.out.print("*");
                    j--;
                }
            }
            else
            {
                int j=4;
                while (j<=i) {
                    System.out.print("*");
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}

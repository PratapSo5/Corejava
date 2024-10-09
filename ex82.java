//  print sum of series :- 100+90+80+______+n terms

import java.util.Scanner;

public class ex82 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no.of terms");
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while (i<=n) {
            s=s+(100-((i-1)*10));
            i++;
        }
        System.out.println("sum of series "+s);
    }
}

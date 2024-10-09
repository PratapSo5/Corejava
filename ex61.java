// Accept  a value and find their factor values

import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre  a value");
        int n=sc.nextInt();
        int i=1;
        while ((i<=n)) {
            if (n%i==0) 
                System.out.println(i +"\t");
                i++;
            
        }
    }
}

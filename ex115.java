// accept a value and fond factrioal value
import java.util.*;
public class ex115 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entere  a value ");
        int n=sc.nextInt();
        int f=1;
        do{
            f=f*n;
            n--;
        }while(n>1);
        System.out.println("a factrioal number  "+f);
    }
}

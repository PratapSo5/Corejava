// Accept a value and find the factrioal value
 import java.util.*;
public class ex90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a value");
        int n=sc.nextInt();
        int f=1;
        for(int i=1; i<=n;i++){
            f=f*i;
        }
        System.out.println("A factrioal number "+f);
    }
}

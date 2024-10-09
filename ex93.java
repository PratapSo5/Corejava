// //genrates prime value from 10 to 100
// import java.util.Scanner;
public class ex93 {
    public static void main(String[] args) {
        int flag=0;
        for(int i=10;i<=100;i++){
            int n=i;
            for(int j=2;j<=n/2 && flag==0;j++){
                if (n%j==0) {
                    flag=1;
                }
            }
            if (flag==0) 
                System.out.print(   n+   "\t"    );
                flag=0;
            
        }
    }
}

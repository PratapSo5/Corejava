import java.util.Scanner;
// find greatest number  b/w 4 values  using nested if-else statement 
public class ex53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 Values ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int g=a;
        if (a>b) {
            if(a>c){
                if(a>d)
                g=a;
                else
                g=d;
            }
            else{
                if (c>d) 
                    g=c;
                else
                g=d;
                
            }
        }
        else
        if (b>c) {
            if (b>d) 
                g=b;
                else
                g=d;
            }
            else{
                if(c>d)
                g=c;
                else
                g=d;
            }
            System.out.println("A is greatest val=  "+g);
        
    }
}

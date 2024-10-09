
/* Accept a value at divide is by 7,if remender will be oddthen find the
    square of  accepted value otherwises cube of accepted value
 */
import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        int r=a%7;
        if(r%2==1){
            System.out.println("Square value  "+(a*a));
        }
        else
        System.out.print("Cube of value  "+(a*a*a));
    }
}

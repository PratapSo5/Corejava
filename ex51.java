

import java.util.Scanner;

/*accept  two value and divide first values by the 2nd  value ,if quotient value  greater than remainder 
value  then perform addtion opertaion b/w accepted values otherwises multiplication operation
 */
public class ex51 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=(a%b);
        int q=(a/b);
        if(q>r){
            System.out.println("sum of two values "+(a+b));
        }
        
        else
        System.out.print(("multiplication of two values"+(a*b)));
    }
}

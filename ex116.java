/*
 * perform an arthicmetic operationby the choice  of user
    1->add,2-> sub, 3->multi, 4->div
 */
import java.util.*;
public class ex116 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=0;
        int n=0;
        do{
            System.out.println("Enter  0 for Accepting value");
            System.out.println("Enter  1 for Add");
            System.out.println("Enter  2 for Sub");
            System.out.println("Enter  3 for multi");
            System.out.println("Enter  4 for div");
            System.out.println("Enter  5 for rem");
            System.out.println("Enter  any one choice");
            int c =sc.nextInt();
            switch (c) {
                case 0:
                System.out.println("Enter 2 value");
                a=sc.nextInt();
                b=sc.nextInt();
            break;
            case 1:
            System.out.println("sum = "+(a+b));
            break;

            case 2:
            System.out.println("sub = "+(a-b));
            break;

            case 3:
            System.out.println("multi = "+(a*b));
            break;

            case 4:
            System.out.println("div = "+(a/b));
            break;

            case 5:
            System.out.println("rem = "+(a%b));
            break;

            
                default:
                System.out.println("wrong choice");
            }
                    System.out.println("Enter 1 for continue and  0 for exit");
                    // int n=sc.nextInt();
            }  while(n==1);
        }
    }


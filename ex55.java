/*  Acceptthe value and perform an operationof the arithmetic operation by selecting  
 * 1->add
 * 2->sub
 * 3->multi
 * 4->div
 * 5->mod div
*/

import java.util.Scanner;

public class ex55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Entre 1->add ,2->sub ,3->mub ,4->div ,5->mod");
        System.out.println("Enter your choice");
        int c=sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Add ="+(a+b));
                break;
            case 2:
                System.out.println("Sub ="+(a-b));
                break;
                case 3:
                System.out.println("Multi ="+(a*b));
                break;
            case 4:
                System.out.println("div ="+(a/b));
                break;
            case 5:
                System.out.println("Mod ="+(a%b));
                break;
            default:
            System.out.print("Wrong choice");
                break;
        }
    }
}

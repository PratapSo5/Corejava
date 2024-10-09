// Accept a value for a day then print the day name
import java.util.*;
public class ex54 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  yuor choice 1/2/3/4/5/6/7");
        int c=sc.nextInt();
        switch (c) {
            case 1:
            System.out.println("Monday");
                break;

                case 2:
            System.out.println("Tuseday");
                break;

                case 3:
            System.out.println("Wednesday");
                break;

                case 4:
            System.out.println("Thrusday");
                break;

                case 5:
            System.out.println("Friday");
                break;

                case 6:
            System.out.println("Saturday");
                break;

                case 7:
            System.out.println("Sunday");
                break;
        
            default:
            System.out.println("Wrong Choice");
                break;
        }
    }
}

// Working with words by accepting 

import java.util.Scanner;

public class ex11 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a charcter");
        char c1=sc.nextLine().charAt(3);
        System.out.println("enter a  message for reading  only a  single charcter");
        char c2=sc.next().charAt(2);
        System.out.println(c1);
        System.out.println(c2);
    }
    
}

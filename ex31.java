// Accept a value and pass it asargument to the method for  performing the squaring operation

import java.util.Scanner;

// public class ex31 {
//     int a;
//     void input(int i)
//     {
//         int a=i;
//     }

//     void display(){
//         int b=a*a;
//         System.out.println("Sqaure of a:-"+b);
//     }
//     public static void main(String[] args) {
//         ex31 x=new ex31();
//         x.input(5);
//         // x.Sqaure(i);
//         x.display();
//     }
// }




public class ex31 {

    void input(int a){
        System.out.println("A square  value ="+(a*a));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ex31 x=new ex31();
        System.out.println("enter value of a");
        int a=sc.nextInt();
        x.input(a);
    }
}

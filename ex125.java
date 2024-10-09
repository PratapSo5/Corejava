// Accept array values  and displaythese values [using oops concept]

import java.util.Scanner;

public class ex125 {
    int size;
    int a[];
    void setsize(int i){
        size=i;a=new int [size];
    }
    void input(int i, int v){
            a[i]=v;
    }
    void display(){
        System.out.println("Arrays values are : ");
        for(int i=0;i<size; i++)
        System.out.print(a[i]+ "\t");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thee size of array : ");
        int s=sc.nextInt();
        ex125 x=new ex125();
        x.setsize(s);
        for(int i=0; i<s;i++){
            System.out.println("enter a value ");
            int v=sc.nextInt();
            x.input(i,v);
        }
        x.display();
        
    }
}

// wrokung with multiple catch blocks
import java.util.*;
import java.io.DataInputStream;
import java.io.IOException;
public class Ex180 {
    public static void main(String[] args) {
        
        try{
            DataInputStream inn=new DataInputStream(System.in);
            System.out.println("Enter array size");
            int s=Integer.parseInt(inn.readLine());
            int n[]=new int[s];
            
            for(int i=0;i<s;i++){
                System.out.println("Enter an element");
                n[i]=Integer.parseInt(inn.readLine());

            }
            System.out.println("Enter index  foe accesing array element");
            int j=Integer.parseInt(inn.readLine());
            System.out.println("Array element is "+n[j]);
        }
        catch(NumberFormatException e1){
            System.out.println("Error due to conersion operation is failed");
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Error due to wrong indexof the array");
        }
        catch(IOException e3){
            System.out.println("Error duee to input resoyrce not avaiable");
        }
    }
}

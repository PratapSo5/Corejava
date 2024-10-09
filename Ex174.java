// working with try-catch  block with respect to ArayIndexOutOfBounds Exception
import java.util.*;;
public class Ex174 {
    public static void main(String[] args) {
        try{
            int n[]={10,20,30,40};
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a value for an index for accessing value form  the array variable");
            int i=sc.nextInt();
            System.out.println("Array element ="+n[i]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error due to wrong choice");
        }
    }
}

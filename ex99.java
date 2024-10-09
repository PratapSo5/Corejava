// sum of series  1+2+3+_____+n terms
import java.util.*;;
public class ex99 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the no.of term  ");
        int n=sc.nextInt();
        int s=0;
        for(int i=1; i<=n;i++){
            s=s+i;
        }
        System.out.println("sumof series  "+s);
    }
}

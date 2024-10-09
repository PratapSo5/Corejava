/*
  1
  1 3
  1 3 5
  1 3 5 7
 */
public class ex111 {
    public static void main(String[] args) {
        for(int i= 1;i<=4; i++){
            for(int j=1; j<=i;j++){
                System.out.print((2*j-1)+ " ");
            } 
            System.out.println();
        }
    }
}

// working with try-catch block withh respect tom Number FormatException class

public class Ex175 {
    public static void main(String[] args) {
        try{
            String s="Hello";
            System.out.println("s="+s);
            int n=Integer.parseInt(s);
            System.out.println("n="+n);
        }catch(NumberFormatException e){
            System.out.println("error due to conversion opertaion failed");
        }
    }
}

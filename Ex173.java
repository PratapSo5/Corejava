// working with  try-catch block w.r.to NULLPointerException class

import javax.crypto.NullCipher;

public class Ex173 {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println("s="+s);
            System.out.println("A  charcter at 0th index ="+s.charAt(0));

        }catch(NullPointerException e){
            System.out.println("error be causes object  pointed by null");
        }
    }
}

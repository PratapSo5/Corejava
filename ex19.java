// Displaying Multiple message using more tha one method

public class ex19 {
    void msg1(){
        System.out.println("Welcome to java");
    }

    void msg2(){
        msg1();
        System.out.println("Welcome to java and  learn java");
    }

    public static void main(String args[]){
        ex19 x=new ex19();
        x.msg2();
    }
    
}

// wroking with multiple inheritance 

/**
 * Innerex142
 */
 class  Base {
void display1(){
    System.out.println("this is method  of base class");
} 
}
/**
 * Innerex142
 */
 class child extends Base  {
void display2(){
    System.out.println("this is method of child class");
} 
}

class subchild extends child  {
    void display3(){
        System.out.println("this is method of subchild class");
    } 
    }



public class ex142 {
    public static void main(String[] args) {
        subchild x=new subchild();
        x.display1();
        x.display2();
        x.display3();
    }
}

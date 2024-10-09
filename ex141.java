// wroking with single level inheritance

/**
 * ex141
 */

 class base {
    void display1(){
        System.out.println("This is method of base class");
    }    
}

class child extends base {
            void display2(){
                System.out.println("This is  method of child class");
            }
    
}
public class ex141 {

        public static void main(String[] args) {
            child x=new child();
            x.display1();
            x.display2();
        }
}


/*another approach

 class base {
    void display1(){
        System.out.println("This is method of base class");
    }    
}

class child extends base {
            void display2(){
                System.out.println("This is  method of child class");
            }
     public static void main(String[] args) {
            child x=new child();
            x.display1();
            x.display2();
        }   
    
}

-----file save   child.java ------
*/
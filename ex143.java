// wroking with  Hierarichal inheritance

 class  A {
    void display1(){
        System.out.println("class A");
    }
}

class  B extends A {
    void display2(){
        System.out.println("class B");
    }
}

class  c extends A {
    void display3(){
        System.out.println("class C");
    }
}

class  D extends B {
    void display4(){
        System.out.println("class D");
    }
}

class  E extends B {
    void display5(){
        System.out.println("class E");
    }
}

public class ex143 {
    public static void main(String[] args) {
         c x=new c();
         D y =new D();
         E z=new E();
         x.display1();
         x.display3();
         y.display1();
         y.display2();
         y.display4();
         z.display1();
         z.display2();
         z.display5();
    }
}

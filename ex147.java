// wroking with  default member
class A{
    void display(){
        System.out.println("classA");
    }
}
 class ex147 extends A {
    public static void main(String[] args) {
        ex147 x=new ex147();
        x.display();
    }
    
}

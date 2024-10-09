// protected  wroking with member
class A{
    protected void display(){
        System.out.println("class A");
    }
}
  class ex146 extends A {
    public static void main(String[] args) {
        ex146 x=new ex146();
        x.display();
    }

}

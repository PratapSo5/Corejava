// wroking with  final member
public class ex154 {
    final  void display(){
        System.out.println("clas A");
    }
}
class A extends ex154 {
    public static void main(String[] args) {
        A x = new A();
        x.display();
    }
}


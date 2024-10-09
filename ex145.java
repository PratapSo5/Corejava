 class A {
   private void display(){
    System.out.println("class A");
   } 
   public void call(){
    display();
   }
}

 class ex145 extends A {
   public static void main(String[] args) {
      
      ex145 x =new ex145();
      x.call();
   }

    
}


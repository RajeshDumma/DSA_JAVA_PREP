package StringsAndOops.AccessModifiers;

class A{
  final void display(){
        System.out.println("I am a display method from class A");
    }
}
class B extends A{

    // method overriding
    /*void display(){
        System.out.println("I am a display method from class B");
    }*/
}

public class FinalMethodEx {
    public static void main(String[] args){
        B obj = new B();
        obj.display();

    }
}

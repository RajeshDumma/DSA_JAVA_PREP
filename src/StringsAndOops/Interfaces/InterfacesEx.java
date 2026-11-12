package StringsAndOops.Interfaces;

interface A{

    int p = 10;

    void show();
    void display();
}

class B implements A{
   public void show(){
        System.out.println("I am show method in B class");
    }

   public void display(){
        System.out.println("I am a Display method in B class");
    }
}

public class InterfacesEx {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.display();
    }
}

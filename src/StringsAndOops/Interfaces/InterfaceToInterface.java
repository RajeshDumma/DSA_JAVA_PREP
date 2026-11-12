package StringsAndOops.Interfaces;

interface x{
    int a = 20;
    void show();
}

interface y extends x{
    int b = 40;
    void display();
}

class C implements y{
    public void display(){

    }

    public void show(){

    }

    void add(){
        System.out.println(a + b);
    }
}

public class InterfaceToInterface {
    public static void main(String[] args){
        C obj = new C();
        obj.display();
        obj.show();
        obj.add();
        System.out.println(x.a);
        System.out.println(y.b);
    }
}

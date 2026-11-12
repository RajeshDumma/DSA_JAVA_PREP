package StringsAndOops.Interfaces;
// Program to demonstrate multiple inheritance in java using interface

class p{
    int a = 10;

    void methodA(){
        System.out.println("i am methodA from  p class");
    }
}
interface q{
    int b = 20;
    void show();
}

interface r{
    int c = 30;
    void display();
}

class s extends p implements q,r{
    int d = 40;

    public void show(){
        System.out.println("this show method from q interface implemented in s class");
    }
    public void display(){
        System.out.println("this display method from r interface implemented in s class");
    }

    void add(){
        super.methodA();
        System.out.println(a + b + c +d);
    }

}

public class MultipleInhertiance {
    public static void main(String[] args){

        s obj = new s();
        obj.show();
        obj.display();
        obj.add();
        obj.methodA();

    }
}

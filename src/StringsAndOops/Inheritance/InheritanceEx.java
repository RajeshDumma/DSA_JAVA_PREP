package StringsAndOops.Inheritance;

class A{
    int p;
   A(){}
    A(int p){
        this.p = p;
    }

    void display(){
        System.out.println("I am a Super Class method Display, My variable p is :" + p);
    }
}

class B extends A{
    int q;
   B(){}
    B(int a,int b){
        p = a;
        q = b;
    }
    void  show(){
        System.out.println("I am a Sub class method show, my variable q is " + q);
    }
}

public class InheritanceEx {
    public static void main(String[] args){ // main method

        B obj = new B(10, 20);
        obj.show();
        obj.display();
       // obj.p = 45;
       // obj.display();
    }
}

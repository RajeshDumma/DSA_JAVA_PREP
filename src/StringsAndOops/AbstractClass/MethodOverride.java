package StringsAndOops.AbstractClass;

class Example{
    void add(int a, int b){
        System.out.println("Adding super class two numbers : " + (a + b));
    }
}

class Example1 extends Example{
    // void (a, b)
    void add(int p, int q){
        super.add(p,q);
        System.out.println("Adding Sub class numbers: " + (p  +q));
    }
}

public class MethodOverride {
    public static void main(String[] args){
        Example1 obj = new Example1();
        obj.add(10,20);
    }
}

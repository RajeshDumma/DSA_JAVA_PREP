package StringsAndOops.Inheritance;

class Example{
    int a;
    Example(){}

    Example(int a){
        this.a = a;
    }
}

class Example1 extends Example{
    int b;
    Example1(int b, int a){
        this.b = b;
        this.a = a;
    }

    void addList(){
        System.out.println("Addition of a + b: " + (a + b) );
    }
}

class Example2 extends Example{
    int c;

    Example2(int c, int a){
        this.c = c;
        this.a = a;
    }
    void subList(){
        System.out.println("Substraction of a - c: " + (c - a));
    }
}

public class HierarchicalEx {
    public static void main(String[] args){

        Example1 ex = new Example1(10, 20);
        ex.addList();

        Example2 ex1 = new Example2(100, 80);
        ex1.subList();
    }
}

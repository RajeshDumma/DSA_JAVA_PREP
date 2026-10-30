package StringsAndOops;

class Ex{

    // instance Variables
    int a;
    int b;

    // instance methods
    void add(){ // method defination
        System.out.println(a+b);
    }

    void mul(int p, int q){ // Method Defination
        System.out.println(p * q);
    }

    void add(int a){
        System.out.println(a);
    }

    // method Overloading :- Two or more methods in a one class having same name with different signature
    void add(int a, int b){
        System.out.println(a + b);
    }


}

public class MethodsEx {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        Ex obj1 = new Ex();
        obj1.a = x;
        obj1.b=y;

        int a = 5;
        int b = 10;
        obj1.add(); // Method Calling
        obj1.mul(a, b); // method Calling
        obj1.add(20);
        obj1.add(50, 50);

    }
}

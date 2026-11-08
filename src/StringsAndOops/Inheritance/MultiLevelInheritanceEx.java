package StringsAndOops.Inheritance;

class Laptop{

    Laptop(){}

    int a;
    Laptop(int a) {
        this.a = a;
    }
    void copyCode(){
     System.out.println("Implemented copy code " + a);
    }
}

class Dell extends Laptop{

    Dell(){};
    int x;

    Dell(int x, int a){
        this.x = x;
        this.a = a;
    }

    void pasteCode(){
        System.out.println("Implemented pasteCode " + (x + a));
    }
}

class Apple extends Dell{

    Apple(){}
    int c;

    Apple(int a, int x, int c){
        this.x = x;
        this.a = a;
        this.c = c;
    }

    void DeleteCode(){
        System.out.println("Implemented Deleted code " + (a + x + c));
    }
}

public class MultiLevelInheritanceEx {
    public static void main(String[] args){

        Apple ap = new Apple(10, 20, 30);
        ap.DeleteCode();
        ap.copyCode();
        ap.pasteCode();
    }
}

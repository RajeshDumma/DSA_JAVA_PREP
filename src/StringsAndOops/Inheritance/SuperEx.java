package StringsAndOops.Inheritance;

class Head{
    int p = 10; // members variables

    void show(){ // members methods
        System.out.println("class Head: "+p);
    }
}
class Tail extends Head{

    // p = 10, show() -----> from Head (super class)

    int q = 30;
    int p = 45;

    void show(){
        super.show();
        System.out.println("class Tail: "+ super.p);
        System.out.println("class Tail: "+p);
    }
}

public class SuperEx {
    public static void main(String[] args){

        Tail obj = new Tail();
        obj.show();
    }
}

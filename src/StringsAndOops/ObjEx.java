package StringsAndOops;

class human{
    //instance variable
    String name;
    int age;

    //instance methods
    void walk(){
        System.out.println(name+ " is walkning");
    }

    void talk(){
        System.out.println(name+ " is talking");
    }
}

// driver class
public class ObjEx {
    public static void main(String[] args){
        human h1 = new human();
        h1.name = "Rajesh";
        h1.age = 23;
        h1.talk();
        h1.walk();
    }
}

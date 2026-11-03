package StringsAndOops;

class JavaClass{

    String name; // instant variable

    void presenting(){
        System.out.println("ppt was presented by " + name);
        teaching();

    }

    static String board;

    static void teaching(){
        System.out.println("the teaching board is : "+ board + " color");
    }
}
public class StaticEx {
    public static void main(String[] args){
        JavaClass obj = new JavaClass();
        obj.name = "Rajesh";

        JavaClass.board = "Black";
        obj.presenting();


        JavaClass.teaching();
    }
}

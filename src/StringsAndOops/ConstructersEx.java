package StringsAndOops;

class Example{

    String channel;

    Example(){ // default constructor
        channel = "Welcome to my nerchukundama youTube channel";
    }
    Example(String channel){ // parameterized constructor
        this.channel = channel;
    }
}
public class ConstructersEx {
    public static void main(String[] args){
        Example e = new Example();
        System.out.println(e.channel);

        Example e1 = new Example("TWg");
        System.out.println(e1.channel);
    }
}

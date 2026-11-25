package StringsAndOops.AccessModifiers;

public class FInalEx {
    public static void main(String[] args){
        final int a =10; // final means constant, can't change the value
        System.out.println(a);
       // a = 40; // error
        System.out.println(a);
    }

}

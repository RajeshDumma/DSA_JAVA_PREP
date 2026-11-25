package StringsAndOops.AccessModifiers;

public class AccessmodifierEx {
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    AccessmodifierEx(){
        System.out.println("a Value from sameClass: " + a);
        System.out.println("b Value from sameClass: " + b);
        System.out.println("c Value from sameClass: " + c);
        System.out.println("d Value from sameClass: " + d);
    }

}

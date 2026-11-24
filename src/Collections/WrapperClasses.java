package Collections;

public class WrapperClasses {
    public static void main(String[] args){
        int a = 10;
        Integer b = new Integer(a);
        System.out.println(b);
        char ch = 'D';
        Character c = new Character(ch);
        System.out.println(c.charValue()); // it will inheritance the object
    }

}

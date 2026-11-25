package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>(4,3);
        System.out.println("Initial capacity : "+ v.capacity());
        v.add(2);
        v.add(4);
        v.add(6);
        v.add(8);
        System.out.println("After adding 4 Elements : "+ v.capacity());
        v.add(10);
        System.out.println("After addind extra Element : " + v.capacity());

        Enumeration<Integer> li = v.elements();

        while (li.hasMoreElements()){
            System.out.print(li.nextElement() + " ");
        }
        System.out.println();

        System.out.println(v.size());


    }
}

package Collections;

import java.util.*;


public class ArrayListEx {
    public static void main(String[] args){
        ArrayList <Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(50);
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println(list.isEmpty() +" And " +list.size());
        System.out.println(list.remove(1));
        for(int a : list){
            System.out.print(a + " ");
        }
        System.out.println();

        ListIterator<Integer> li = list.listIterator();
        while (li.hasNext()){
            System.out.print(li.next() + " ");
        }
    }
}

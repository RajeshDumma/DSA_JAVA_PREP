package Collections;
import java.util.*;

public class LinkedListEx {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Rajesh");
        list.add("Mythili");
        list.add("pooja");
        list.add(1,"Nikilesh");
        System.out.println(list);
        list.addFirst("semi");
        list.addLast("John");
        System.out.println(list);
        System.out.println(list.contains("Rajesh"));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(3));
        System.out.println(list.size());

    }
}

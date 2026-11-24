package Collections;
import java.util.*;

public class SetEx {
    public static void main(String[] args){
        HashSet<String> str = new HashSet<>();
        String[] names = {"Rajesh", "pooja", "hari", "nikilesh", "mythili","Rajesh"};

        for(String name: names){
            str.add(name);
        }
        System.out.println(str);
        System.out.println(str.add("pooja"));
        System.out.println(str.add("Kishor"));

        if(str.isEmpty()){
            System.out.println("nmaes hashset is empty");
        } else{
            System.out.println(str.size());
        }

        System.out.println(str.contains("Rajesh"));

        if(str.contains("Rajesh")) str.remove("Rajesh");
        System.out.println(str +"And size: " + str.size());

        for(String v : str){
            System.out.println("welcome : "+ v);
        }

        Iterator<String> value = str.iterator();

        while(value.hasNext()){
            System.out.println("welcome: " + value.next());
        }
    }
}

package Collections;
import java.util.HashSet;

public class SetEx1 {
    public static void main(String[] args){
        HashSet<String> unique = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();

        String[] names = {
                "Rajesh", "Pooja", "Hari",
                "Rajesh", "Kishor", "Pooja",
                "Hari", "Ravi"
        };
        int duplicateCout = 0;
        for(String name : names) {
            if(unique.contains(name)){
                duplicate.add(name);
                duplicateCout++;
            } else {
               unique.add(name);
            }
        }
        System.out.print("Unique names : ");
        for(String uniqueName : unique) System.out.print(uniqueName+ " ");
        System.out.println();
        System.out.print("Duplicate names : ");
        for(String uniqueName : duplicate) System.out.print(uniqueName + " ");
        System.out.println();
        System.out.println("duplicateCountName : " + duplicateCout);
    }
}

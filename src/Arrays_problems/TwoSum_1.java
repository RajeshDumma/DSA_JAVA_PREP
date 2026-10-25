package Arrays_problems;
import java.util.*;
public class TwoSum_1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
       }

       int target = sc.nextInt();
       HashMap<Integer, Integer>  map = new HashMap<>();
       for(int i = 0; i < arr.length; i++){

           int complement = target - arr[i];
           if(map.containsKey(complement)){
               System.out.println(Arrays.toString(new int[] {map.get(complement), i}));
           }
           map.put(arr[i], i);
       }
       sc.close();
    }
}

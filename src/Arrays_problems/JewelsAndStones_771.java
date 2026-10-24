package Arrays_problems;

import java.util.*;
public class JewelsAndStones_771 {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        String jewels = sc.next();
        String stones = sc.next();

// HashSet: Learn to optimize searching using a data structure.
        HashSet<Character> jeweleSet = new HashSet<>();

        for(int i = 0; i < jewels.length(); i++){
            jeweleSet.add(jewels.charAt(i));
        }
        int jewelsCount = 0;

        for(int i = 0; i < stones.length(); i++){
           if(jeweleSet.contains(stones.charAt(i)))
                    jewelsCount++;
        }

        System.out.println(jewelsCount);

        sc.close();

        //Nested loops: Build your understanding of brute-force solutions.

/*        class Solution {
            public int numJewelsInStones(String jewels, String stones) {

                // if(!stones.contains(jewels)){
                //     return 0;
                // }

                char[] j = jewels.toCharArray();
                int len1 = j.length;

                char[] s = stones.toCharArray();
                int len2 = s.length;

                int count=0;

                for(int i=0; i<len1 ; i++){
                    for(int k=0 ; k<len2; k++){
                        if(j[i]==s[k]){
                            count++;
                        }
                    }
                }

                return count;

            }
        }*/
    }
}

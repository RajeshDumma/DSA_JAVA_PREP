package Arrays_problems;

import java.util.Scanner;

public class ValidAnagram_242 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if(s.length() != t.length()){
            System.out.println(false);
            return;
        }
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int value : count){
            if(value != 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
